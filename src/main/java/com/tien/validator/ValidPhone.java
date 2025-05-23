package com.tien.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ValidPhoneImpl.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPhone {
    String message() default "Bắt đầu bằng 0 và có đúng 10 chữ số";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}