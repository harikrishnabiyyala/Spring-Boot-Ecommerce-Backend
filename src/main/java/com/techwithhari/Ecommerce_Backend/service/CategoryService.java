package com.techwithhari.Ecommerce_Backend.service;

import com.techwithhari.Ecommerce_Backend.model.Category;
import com.techwithhari.Ecommerce_Backend.payload.CategoryDTO;
import com.techwithhari.Ecommerce_Backend.payload.CategoryResponse;

public interface CategoryService {

    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
