package com.tien.controller;

import com.tien.dto.B5DTO;
import com.tien.dto.B5DTO.AdminGroup;
import com.tien.dto.B5DTO.UserGroup;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
public class B5Controller {

    @Autowired
    private Validator validator;

    @GetMapping("/b5_form")
    public String showForm(Model model) {
        model.addAttribute("b5DTO", new B5DTO());
        return "b5_form";
    }

    @PostMapping("/b5_add")
    public String handleForm(@ModelAttribute("b5DTO") B5DTO b5DTO,
                             Model model) {

        Class<?> group = b5DTO.getRole().equalsIgnoreCase("admin") ? AdminGroup.class : UserGroup.class;
        BindingResult bindingResult = new BeanPropertyBindingResult(b5DTO, "b5DTO");

        Set<ConstraintViolation<B5DTO>> violations = validator.validate(b5DTO, group);

        for (ConstraintViolation<B5DTO> violation : violations) {
            String fieldName = violation.getPropertyPath().toString();
            bindingResult.rejectValue(fieldName, "", violation.getMessage());
        }

        if (bindingResult.hasErrors()) {
            model.addAttribute("org.springframework.validation.BindingResult.b5DTO", bindingResult);
            return "b5_form";
        }

        return "b5_success";
    }
}
