package com.samfowler.productcatalog;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samfowler.productcatalog.entity.Product;
import com.samfowler.productcatalog.exception.ProductNotFoundException;
import com.samfowler.productcatalog.repository.ProductRepository;

@RestController
public class ProductCatalogController {

	private final ProductRepository repository;
	private static final Logger log = LoggerFactory.getLogger(ProductCatalogController.class);
	
	ProductCatalogController(ProductRepository repository){
		this.repository = repository;
	}

	@GetMapping("/ping")
	String pingServer(){
		log.info("Processing ping request");
		return "pong";
	}
	
	@GetMapping("/products")
	List<Product> getAllProducts(){
		log.info("Processing request to get all Products");
		return repository.findAll();
	}
	
	@GetMapping("/products/{id}")
	Product getProductById(@PathVariable Long id) {
		log.info("Received request to get Product with ID: "+id.toString());
		return repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
	}
	
	@PutMapping("/products/{id}")
	Product updateProductById(@RequestBody Product newProduct, @PathVariable Long id){
		log.info("Received request to update Product with id "+id.toString()+" with values: "+newProduct.toString());
		return repository.findById(id).map(product -> {
			product.setName(newProduct.getName());
			product.setCategory(newProduct.getCategory());
			product.setVendor(newProduct.getVendor());
			product.setDescription(newProduct.getDescription());
			product.setPrice(newProduct.getPrice());
			product.setColour(newProduct.getColour());
			product.setSize(newProduct.getSize());
			product.setGender(newProduct.getGender());
			product.setQuantity(newProduct.getQuantity());
			product.setReserved(newProduct.getReserved());
			return repository.save(product);
		}).orElseThrow(() -> new ProductNotFoundException(id));
	}
	
	@PutMapping("/products/{id}/quantity")
	Product updateProductQuantityById(@RequestBody int newQuantity, @PathVariable Long id){
		log.info("Received request to update Product Quantity Count with id "+id.toString()+" with value: "+newQuantity+"");
		return repository.findById(id).map(product -> {
			product.setQuantity(newQuantity);
			return repository.save(product);
		}).orElseThrow(() -> new ProductNotFoundException(id));
	}
	
	@PutMapping("/products/{id}/reserved")
	Product updateProductReservedById(@RequestBody int newReserved, @PathVariable Long id){
		log.info("Received request to update Product Reserved Count with id "+id.toString()+" with value: "+newReserved+"");
		return repository.findById(id).map(product -> {
			product.setReserved(newReserved);
			return repository.save(product);
		}).orElseThrow(() -> new ProductNotFoundException(id));
	}
	
	@PostMapping("/products")
	Product createProduct(@RequestBody Product newProduct) {
		log.info("Received request to create Product with values: "+newProduct.toString());
		return repository.save(newProduct);
	}
	
	@DeleteMapping("/products/{id}")
	void deleteProduct(@PathVariable Long id) {
		log.info("Received request to delete Product with id "+id.toString());
		repository.deleteById(id);
	}

	
}
