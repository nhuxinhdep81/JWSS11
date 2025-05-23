package com.tien.dto;

import com.tien.validator.UniqueCategoryName;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class B8CategoryDTO {
    private int id;

    @NotBlank(message = "Tên danh mục không được trống")
    @Size(min = 2, max = 50, message = "Tên danh mục từ 2 đến 50 ký tự")
    @UniqueCategoryName(message = "Tên danh mục đã tồn tại")
    private String categoryName;

    private boolean status = true;
}
