package com.tien.dto;

import com.tien.validator.CheckMovieExistByTitle;
import jakarta.validation.constraints.*;
import lombok.Data;


import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;
import java.util.Date;

@Data
public class MovieDTO {

    private int id;

    @NotBlank(message = "Title khong duoc de trong")
    @CheckMovieExistByTitle
    private String title;

    @Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
    message = "Email khong hop le")
    private String email;

    @Min(value = 1, message = "So luong: 1 - 20!")
    @Max(value = 20, message = "So luong: 1 - 20!")
    private int quantity;

    @Past(message = "Ngay sinh khong hop le")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @Future(message = "su kien toi phai la tuong lai")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date eventDate;
}


