package com.example.SpringRelationsReviewLab.Category;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
private final CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }


    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }

    public Category getCategoryById(String id) {
        Long Category_id = Long.parseLong(id);
        return categoryRepo.findById(Category_id).orElse(null);
    }

    public void deleteCategoryById(String id) {
        Long Category_id = Long.parseLong(id);
        categoryRepo.deleteById(Category_id);
    }

    public Category addCategory(Category Category) {
        return categoryRepo.save(Category);
    }
}
