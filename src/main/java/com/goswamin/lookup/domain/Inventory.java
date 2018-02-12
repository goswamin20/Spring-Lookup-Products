package com.goswamin.lookup.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long inventoryId;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "inventory")
    private Set<Product> products;
    private long numberOfProducts;

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public long getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(long numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
}
