package com.macadev.backendecom.service;

import com.macadev.backendecom.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    void createCategory(Category category);
    void updateCategory(Category category, Long categoryId);
    String deleteCategory(Long id);
}
