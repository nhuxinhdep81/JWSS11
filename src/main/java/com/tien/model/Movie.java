package com.tien.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Movie {

    private int id;
    private String title;
    private String email;
    private int quantity;
    private Date birthday;
    private Date eventDate;
}