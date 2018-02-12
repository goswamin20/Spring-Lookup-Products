package com.goswamin.lookup.repositories;

import com.goswamin.lookup.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
