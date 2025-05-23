package com.tien.service;

import com.tien.model.Movie;
import com.tien.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie findByTitle(String title) {
        return movieRepository.findByTitle(title);
    }
}
