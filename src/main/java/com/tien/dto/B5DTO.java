package com.tien.dto;

import com.tien.validator.ValidPassword;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.groups.Default;
import lombok.Data;

@Data
public class B5DTO {

    public interface AdminGroup {}
    public interface UserGroup {}

    @NotBlank(message = "Tên không đc để trống", groups = {Default.class, AdminGroup.class, UserGroup.class})
    private String name;

    @NotBlank(message = "Email không được để trông", groups = {Default.class, AdminGroup.class, UserGroup.class})
    @Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
            message = "Email không hợp lệ",
            groups = {Default.class, AdminGroup.class, UserGroup.class})
    private String email;

    @NotBlank(message = "Password không đc để trống", groups = {Default.class, AdminGroup.class, UserGroup.class})
    @ValidPassword(groups = {Default.class, AdminGroup.class, UserGroup.class})
    private String password;

    @NotBlank(message = "Role không đc để trống", groups = {Default.class})
    private String role;

    @NotBlank(message = "Department không đc để trống nếu role là admin", groups = {AdminGroup.class})
    private String department;


}
