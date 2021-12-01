package com.example.SpringRelationsReviewLab.Category;

import com.example.SpringRelationsReviewLab.Category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("category")
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping("")
    public ResponseEntity getCategory() {
        return ResponseEntity.ok(categoryService.getAllCategory());
    }

    @GetMapping("{id}")
    public Category getCategoryById(@PathVariable String id) {
        return categoryService.getCategoryById(id);
    }

    @DeleteMapping
    public void deleteCategoryById(@PathVariable String id) {
        categoryService.deleteCategoryById(id);
    }

    @PostMapping
    public Category addCategory(@RequestBody Category Category) {
        return categoryService.addCategory(Category);
    }
}

