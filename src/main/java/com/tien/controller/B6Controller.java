package com.tien.controller;

import com.tien.dto.B6DTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class B6Controller {

    @GetMapping("/b6_form")
    public String form(@ModelAttribute("b6DTO") B6DTO b6DTO) {
        return "b6_form";
    }

    @PostMapping("/b6_add")
    public String add(@Valid @ModelAttribute("b6DTO") B6DTO b6DTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "b6_form";
        }
        return "b6_success";
    }
}