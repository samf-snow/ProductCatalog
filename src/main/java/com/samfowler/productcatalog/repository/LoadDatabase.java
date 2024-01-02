package com.samfowler.productcatalog.repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.samfowler.productcatalog.entity.Product;

@Configuration
public class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(ProductRepository repository) {

	return args -> {
	  log.info("Preloading " + repository.save(new Product("Basic Logo T-Shirt", "Apparel", "Nike", "Men's Basic Logo T-Shirt - X-Small - Red", 12.99, "Red","X-Small", "Male", 100, 0)));
	  log.info("Preloading " + repository.save(new Product("Basic Logo T-Shirt", "Apparel", "Nike", "Men's Basic Logo T-Shirt - Small - Red", 12.99, "Red","Small", "Male", 100, 0)));
	  log.info("Preloading " + repository.save(new Product("Basic Logo T-Shirt", "Apparel", "Nike", "Men's Basic Logo T-Shirt - Medium - Red", 12.99, "Red","Medium", "Male", 100, 0)));
	  log.info("Preloading " + repository.save(new Product("Basic Logo T-Shirt", "Apparel", "Nike", "Men's Basic Logo T-Shirt - Large - Red", 12.99, "Red","Large", "Male", 100, 0)));
	  log.info("Preloading " + repository.save(new Product("Basic Logo T-Shirt", "Apparel", "Nike", "Men's Basic Logo T-Shirt - X-Large - Red", 12.99, "Red","X-Large", "Male", 100, 0)));
	  log.info("Preloading " + repository.save(new Product("Basic Logo T-Shirt", "Apparel", "Nike", "Men's Basic Logo T-Shirt - XX-Large - Red", 12.99, "Red","XX-Large", "Male", 100, 0)));
	};
	
}
}