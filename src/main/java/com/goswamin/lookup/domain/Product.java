package com.goswamin.lookup.domain;


import java.util.List;

public class Product {

    List<Item> items;
    long productId;
    String productName;
    String productCategory;
    String productDescription;
    Integer productRating;
    Review reviews;
    Byte[] productImage;
    Retailer retailer;
}
