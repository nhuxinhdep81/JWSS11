package com.tien.repository;

import com.tien.model.Category;
import java.util.List;

public interface CategoryRepository {
    void save(Category category);
    void update(Category category);
    void delete(int id);
    List<Category> findAll();
    Category findByName(String name);
}
