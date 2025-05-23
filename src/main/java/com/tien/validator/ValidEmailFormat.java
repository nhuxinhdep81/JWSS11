package com.tien.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = ValidEmailFormatImpl.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidEmailFormat {
    String message() default "Email không hợp lệ!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

