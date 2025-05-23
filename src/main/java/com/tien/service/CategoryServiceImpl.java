package com.tien.service;

import com.tien.model.Category;
import com.tien.repository.CategoryRepository;
import com.tien.service.CategoryService;
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
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public boolean existsByName(String name) {
        return categoryRepository.findByName(name) != null;
    }
}

