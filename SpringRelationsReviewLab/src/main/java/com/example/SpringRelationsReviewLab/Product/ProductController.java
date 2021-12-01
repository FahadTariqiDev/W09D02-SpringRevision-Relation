package com.example.SpringRelationsReviewLab.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public ResponseEntity getProduct() {
        return ResponseEntity.ok(productService.getAllProduct());
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @DeleteMapping
    public void deleteProductById(@PathVariable String id) {
        productService.deleteProductById(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
}


class ProductData {
    private String name;
    private Long Id;

    public ProductData(String name, Long id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return Id;
    }
}
