package com.goswamin.lookup.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Retailer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long retailerId;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Product> products;

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public long getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(long retailerId) {
        this.retailerId = retailerId;
    }
}
