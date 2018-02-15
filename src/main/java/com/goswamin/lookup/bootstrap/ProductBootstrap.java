package com.goswamin.lookup.bootstrap;

import com.goswamin.lookup.domain.*;
import com.goswamin.lookup.repositories.InventoryRepository;
import com.goswamin.lookup.repositories.ProductRepository;
import com.goswamin.lookup.repositories.RetailerRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class ProductBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private final ProductRepository productRepository;
    private final InventoryRepository inventoryRepository;
    private final RetailerRepository retailerRepository;

    public ProductBootstrap(ProductRepository productRepository,InventoryRepository inventoryRepository,RetailerRepository retailerRepository) {
        this.productRepository = productRepository;
        this.inventoryRepository=inventoryRepository;
        this.retailerRepository=retailerRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        productRepository.saveAll(getProducts());

    }

    private List<Product> getProducts(){
        List<Product> list=new ArrayList<>();
        Inventory i=new Inventory();
        Product p=new Product();
        p.setProductName("White Coat");
        p.setProductRating(Rating.GOOD);
        p.setProductDescription("A nice indian white coat with fine embroidary");
        p.setProductCategory("WOMEN");
        p.setInventory(i);

        List<Item> itemList=new ArrayList<>();
        Item item1=new Item();
        item1.setProduct(p);
        Item item2=new Item();
        item2.setProduct(p);
        Item item3=new Item();
        item3.setProduct(p);
        Item item4=new Item();
        item4.setProduct(p);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        p.setItems(itemList);
        Retailer retailer=new Retailer();
        retailer.setFirstName("Mahua");
        retailer.setLastName("Chaterjee");
        retailerRepository.save(retailer);
        p.setRetailer(retailer);
        list.add(p);

        Product p2=new Product();
        p2.setProductName("Blue Coat");
        p2.setProductRating(Rating.BEST);
        p2.setProductDescription("A nice indian white coat with brochette work");
        p2.setProductCategory("WOMEN");
        p2.setInventory(i);

        List<Item> itemList2=new ArrayList<>();
        Item item5=new Item();
        item5.setProduct(p2);
        Item item6=new Item();
        item6.setProduct(p2);
        Item item7=new Item();
        item7.setProduct(p2);
        Item item8=new Item();
        item8.setProduct(p2);
        itemList2.add(item5);
        itemList2.add(item6);
        itemList2.add(item7);
        itemList2.add(item8);
        p2.setItems(itemList2);
        p2.setRetailer(retailer);
        list.add(p2);

        i.setProducts(new HashSet<Product>(list));
        i.setNumberOfProducts(list.size());
        inventoryRepository.save(i);
        return list;
    }
}
