package com.tien.validator;

import com.tien.service.CategoryService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueCategoryNameValidator implements ConstraintValidator<UniqueCategoryName, String> {

    @Autowired
    private CategoryService categoryService;

    @Override
    public boolean isValid(String categoryName, ConstraintValidatorContext context) {
        return !categoryService.existsByName(categoryName);
    }
}
