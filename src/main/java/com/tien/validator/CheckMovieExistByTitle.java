package com.tien.validator;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CheckMovieExistByTitleImpl.class)
@Target({
        ElementType.FIELD,
        ElementType.METHOD,
        ElementType.ANNOTATION_TYPE
})
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckMovieExistByTitle {
    String message() default "Title already existed!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
