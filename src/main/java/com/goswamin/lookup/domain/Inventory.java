package com.goswamin.lookup.domain;

import javax.persistence.*;

@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long inventoryId;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "inventory")
    private Product products;
    private long numberOfProducts;

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public long getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(long numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
}
