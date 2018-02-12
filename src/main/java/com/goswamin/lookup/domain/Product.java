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
    @Lob
    private String productDescription;
    private Integer productRating;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Review> reviews;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Item> items;
    @Lob
    private Byte[] productImage;
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

    public Integer getProductRating() {
        return productRating;
    }

    public void setProductRating(Integer productRating) {
        this.productRating = productRating;
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
}
