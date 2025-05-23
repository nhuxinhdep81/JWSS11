package com.tien.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidEmailFormatImpl implements ConstraintValidator<ValidEmailFormat, String> {

    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return email.matches(EMAIL_REGEX);
    }
}
