package com.tien.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class B7DTO {
    @NotBlank(message = "Ten khong dc de trong")
    @NotNull(message = "Ten khong dc de trong")
    private String name;

    @NotNull(message = "Email khong dc de trong")
    @Email(message = "Email khong hop le")
    private String email;

    @NotNull(message = "Rating khong dc de trong")
    @Min(value = 1, message = "Rating thap nhat 1")
    @Max(value = 5, message = "Rating cao nhat la 5")
    private Integer rating;

    @Size(max = 200, message = "Comment gio han la 200 ki tu")
    private String comment;
}