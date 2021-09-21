package com.joanna.springBootMongoDocker;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ProductRepository extends MongoRepository<Product, Integer> {
}
