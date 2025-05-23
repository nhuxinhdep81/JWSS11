package com.tien.service;

import com.tien.model.Category;

import java.util.List;

public interface CategoryService {
    void save(Category category);
    List<Category> findAll();
    boolean existsByName(String name);
}
