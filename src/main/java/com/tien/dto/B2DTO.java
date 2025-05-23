package com.tien.dto;

import com.tien.validator.ValidEmailFormat;
import com.tien.validator.ValidPassword;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class B2DTO {
    @NotBlank(message = "Khong dc de trong")
    @NotNull(message = "Khong dc de trong")
    private String name;

    @NotBlank(message = "Khong dc de trong")
    @NotNull(message = "Khong dc de trong")
    @ValidEmailFormat
    private String email;



    @NotBlank(message = "Khong dc de trong")
    @NotNull(message = "Khong dc de trong")
    @ValidPassword
    private String password;
}
