package com.quizzionaire.productservice.repository;

import com.quizzionaire.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
