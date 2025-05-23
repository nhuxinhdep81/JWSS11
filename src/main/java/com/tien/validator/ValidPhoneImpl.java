package com.tien.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidPhoneImpl implements ConstraintValidator<ValidPhone, String> {

    @Override
    public boolean isValid(String phone, ConstraintValidatorContext context) {
        if (phone == null) {
            return false;
        }
        // Kiểm tra số điện thoại: bắt đầu bằng 0 và có đúng 10 chữ số
        return phone.matches("^0\\d{9}$");
    }
}