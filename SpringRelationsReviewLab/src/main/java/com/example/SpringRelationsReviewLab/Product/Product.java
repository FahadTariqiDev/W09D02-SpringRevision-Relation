package com.example.SpringRelationsReviewLab.Product;

import com.example.SpringRelationsReviewLab.Category.Category;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productNAme;
    private double productPrice;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(
            name = "category_id"
    )
    private Category category;

    public Product(Long productId, String productNAme, double productPrice, Category category) {
        this.productId = productId;
        this.productNAme = productNAme;
        this.productPrice = productPrice;
        this.category = category;
    }

    public Product() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductNAme() {
        return productNAme;
    }

    public void setProductNAme(String productNAme) {
        this.productNAme = productNAme;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
