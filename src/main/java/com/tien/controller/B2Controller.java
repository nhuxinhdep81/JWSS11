package com.tien.controller;

import com.tien.dto.B1DTO;
import com.tien.dto.B2DTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class B2Controller {
    @GetMapping("b2_form")
    public String form(@ModelAttribute("b2DTO") B2DTO b2DTO) {
        return "b2_form";
    }

    @PostMapping("b2_add")
    public String add(@Valid @ModelAttribute("b2DTO") B2DTO b2DTO,
                      BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "b2_form";
        }
        return "b2_success";
    }
}
