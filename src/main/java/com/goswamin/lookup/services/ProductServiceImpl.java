package com.goswamin.lookup.services;

import com.goswamin.lookup.domain.Product;
import com.goswamin.lookup.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Set<Product> getProducts() {
        Set<Product> set=new HashSet<>();
        productRepository.findAll().iterator().forEachRemaining(set::add);
        return set;
    }
}
