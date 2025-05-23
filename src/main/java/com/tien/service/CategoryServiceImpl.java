package com.tien.service;

import com.tien.model.Category;
import com.tien.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void update(Category category) {
        categoryRepository.update(category);
    }

    @Override
    public void delete(int id) {
        categoryRepository.delete(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findAll()
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public boolean existsByName(String name) {
        return categoryRepository.findByName(name) != null;
    }

    @Override
    public boolean isUniqueNameWhenUpdate(int id, String name) {
        Category existing = categoryRepository.findByName(name);
        return existing == null || existing.getId() == id;
    }
}
