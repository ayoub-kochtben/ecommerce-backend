package com.example.olivenholz.services.auth;


import com.example.olivenholz.dto.SignupRequest;
import com.example.olivenholz.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);

    Boolean hasUserWithEmail(String email);
}