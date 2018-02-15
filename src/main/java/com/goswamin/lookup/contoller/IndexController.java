package com.goswamin.lookup.contoller;

import com.goswamin.lookup.domain.Product;
import com.goswamin.lookup.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private ProductRepository productRepository;

    public IndexController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndex(){
        Optional<Product> productCategory=productRepository.findByProductCategory("MEN");
        System.out.println("product id: "+productCategory.get().getProductId());
        return "index";
    }
}
