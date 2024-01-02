package com.samfowler.productcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.samfowler.productcatalog.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}


