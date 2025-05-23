package com.tien.dto;

import com.tien.validator.UniqueCategoryName;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class B8CategoryDTO {
    private int id;

    @NotBlank(message = "Tên danh mục không được để trống")
    @UniqueCategoryName
    private String categoryName;

    private boolean status;

}
