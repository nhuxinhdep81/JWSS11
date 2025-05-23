package com.tien.controller;

import com.tien.dto.B7DTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class B7Controller {

    @GetMapping("/b7_form")
    public String form(@ModelAttribute("b7DTO") B7DTO b7DTO) {
        return "b7_form";
    }

    @PostMapping("/b7_add")
    public String add(@Valid @ModelAttribute("b7DTO") B7DTO b7DTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "b7_form";
        }
        return "b7_success";
    }
}