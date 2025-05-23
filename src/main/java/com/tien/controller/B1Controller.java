package com.tien.controller;

import com.tien.dto.B1DTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class B1Controller {

    @GetMapping("b1_form")
    public String form(@ModelAttribute("b1DTO")B1DTO b1DTO) {
        return "b1_form";
    }

    @PostMapping("b1_add")
    public String add(@Valid @ModelAttribute("b1DTO")B1DTO b1DTO,
                      BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "b1_form";
        }
        return "b1_success";
    }
}
