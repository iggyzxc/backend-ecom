package com.macadev.backendecom.service;

import com.macadev.backendecom.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Category category, Long categoryId);
    void deleteCategory(Long id);
}
