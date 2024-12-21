package com.techwithhari.Ecommerce_Backend.repositories;

import com.techwithhari.Ecommerce_Backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByCategoryName(String categoryName);
}
