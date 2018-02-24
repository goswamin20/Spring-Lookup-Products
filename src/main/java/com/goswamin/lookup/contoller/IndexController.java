package com.goswamin.lookup.contoller;

import com.goswamin.lookup.domain.Product;
import com.goswamin.lookup.repositories.ProductRepository;
import com.goswamin.lookup.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private final ProductService productService;

    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndex(Model model){
        model.addAttribute("products",productService.getProducts());
        return "index";
    }
}
