package com.tien.service;

import com.tien.model.Category;

import java.util.List;

public interface CategoryService {
    void save(Category category);
    void update(Category category);
    void delete(int id);
    List<Category> findAll();
    Category findById(int id);
    boolean existsByName(String name);
    boolean isUniqueNameWhenUpdate(int id, String name);
}
