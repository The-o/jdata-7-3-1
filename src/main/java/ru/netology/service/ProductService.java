package ru.netology.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.netology.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<String> getProductNames(String customerName) {
        return repository.getProductNames(customerName);
    }

}
