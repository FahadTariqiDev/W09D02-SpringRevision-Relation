package com.example.SpringRelationsReviewLab.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public Product getProductById(String id) {
        Long product_id = Long.parseLong(id);
        return productRepo.findById(product_id).orElse(null);
    }

    public void deleteProductById(String id) {
        Long product_id = Long.parseLong(id);
        productRepo.deleteById(product_id);
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }
}
