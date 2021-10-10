package ru.netology.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.netology.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products/fetch-product")
    public List<String> getProductNames(@RequestParam String name) {
        return service.getProductNames(name);
    }
}
