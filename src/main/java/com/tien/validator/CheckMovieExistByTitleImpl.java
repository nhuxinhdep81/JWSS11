package com.tien.validator;

import com.tien.model.Movie;
import com.tien.service.MovieService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckMovieExistByTitleImpl implements
        ConstraintValidator<CheckMovieExistByTitle, String> {

    @Autowired
    private MovieService movieService;

    @Override
    public boolean isValid(String title, ConstraintValidatorContext constraintValidatorContext) {
        Movie movie =  movieService.findByTitle(title);
        // moive null => khong ton tai movie => them movie vao db
        // movie not null => gui message ra ngoai title
        if (movie == null) {
            return true;
        }
        return false;
    }
}
