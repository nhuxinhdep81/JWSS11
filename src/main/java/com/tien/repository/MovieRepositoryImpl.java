package com.tien.repository;

import com.tien.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepository {
    @Override
    public Movie findByTitle(String title) {
        List<Movie> movies = Arrays.asList(
                new Movie(1, "movie1", "a@gmail.com", 2, new Date(),new Date()),
                new Movie(2, "movie2", "b@gmail.com", 3, new Date(),new Date())

        );

        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;

    }
}
