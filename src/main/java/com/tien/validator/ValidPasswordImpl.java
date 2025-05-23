package com.tien.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidPasswordImpl implements ConstraintValidator<ValidPassword, String> {

    private static final String PASSWORD_REGEX =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if (password == null || password.trim().isEmpty()) {
            return false;
        }
        return password.matches(PASSWORD_REGEX);
    }
}
