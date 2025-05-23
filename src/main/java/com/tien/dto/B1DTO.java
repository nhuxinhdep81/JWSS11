package com.tien.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class B1DTO {
    @NotBlank(message = "Dữ liệu không được trống")
    @NotNull(message = "Dữ liệu không được trống")
    @Size(min = 2, max = 30, message = "Chuỗi phải từ 2 đến 30 ký tự")
    private String name;


    @NotBlank(message = "Dữ liệu không được trống")
    @NotNull(message = "Dữ liệu không được trống")
    @Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
            message = "Email khong hop le")
    private String email;

    @NotBlank(message = "Dữ liệu không được trống")
    @NotNull(message = "Dữ liệu không được trống")
    @Size(min = 2, max = 30, message = "Chuỗi phải từ 2 đến 30 ký tự")

    private String phone;

    @NotBlank(message = "Dữ liệu không được trống")
    @NotNull(message = "Dữ liệu không được trống")
    @Size(min = 2, max = 30, message = "Chuỗi phải từ 2 đến 30 ký tự")

    private String password;

    @NotNull(message = "Trạng thái không được để trống")
    private Boolean status;


}
