package com.goswamin.lookup.repositories;

import com.goswamin.lookup.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product,Long> {
Optional<Product> findByProductCategory(String productCategory);
}
