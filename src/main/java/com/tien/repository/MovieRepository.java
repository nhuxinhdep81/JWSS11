package com.tien.repository;

import com.tien.model.Movie;

public interface MovieRepository {
    Movie findByTitle(String title);
}
