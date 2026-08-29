package com.example.olivenholz.dto;

import com.example.olivenholz.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String email;
    private String name;
    private UserRole userRole;
}