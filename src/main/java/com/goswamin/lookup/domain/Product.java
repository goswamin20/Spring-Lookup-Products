package com.goswamin.lookup.domain;


import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private String productName;
    private String productCategory;
    @ManyToOne
    private Inventory inventory;
    @ManyToOne
    private Cart cart;
    @ManyToOne
    private Order order;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Lob

    private String productDescription;

    @Enumerated(value=EnumType.STRING)
    private Rating productRating;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Review> reviews;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Item> items;
    @Lob
    private Byte[] productImage;
    @ManyToOne
    private Retailer retailer;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Rating getProductRating() {
        return productRating;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Byte[] getProductImage() {
        return productImage;
    }

    public void setProductImage(Byte[] productImage) {
        this.productImage = productImage;
    }

    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setProductRating(Rating productRating) {
        this.productRating = productRating;
    }
}
