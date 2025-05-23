package com.tien.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = ValidPasswordImpl.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidPassword {
    String message() default "Mật khẩu phải có ít nhất 8 ký tự, gồm chữ hoa, chữ thường và số";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
