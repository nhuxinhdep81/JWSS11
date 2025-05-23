package com.tien.controller;

import com.tien.dto.B8CategoryDTO;
import com.tien.model.Category;
import com.tien.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class B8CategoryController {


    @Autowired
    private CategoryService categoryService;

    @GetMapping("b8_list")
    public String list(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return "b8_list";
    }

    @GetMapping("b8_form")
    public String showForm(Model model) {
        model.addAttribute("category", new B8CategoryDTO());
        return "b8_add";
    }

    @PostMapping("b8_save")
    public String handleForm(@ModelAttribute("category") @Valid B8CategoryDTO dto,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "b8_add";
        }
        Category category = new Category();
        category.setCategoryName(dto.getCategoryName());
        category.setStatus(dto.isStatus());
        categoryService.save(category);
        return "redirect:/b8_list";

    }
}
