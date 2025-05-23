package com.tien.controller;

import com.tien.dto.MovieDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {

    @GetMapping("movie")
    public String movieForm(@ModelAttribute("movieDTO")MovieDTO movieDTO) {
        return "movie_form";
    }

    @PostMapping("movie_save")
    public String movieSave(@Valid @ModelAttribute("movieDTO") MovieDTO movieDTO,
                            BindingResult result) {
        System.out.println(movieDTO);
        System.out.println(result.getFieldErrors());
        System.out.println(result.hasErrors());
        if (result.hasErrors()) {
            return "movie_form";
        }
        return "movie_success";
    }
}
