package com.tien.dto;

import com.tien.validator.ValidPhone;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class B6DTO {

    @NotBlank(message = "Điên thoại không được để trống")
    @ValidPhone
    private String phone;
}