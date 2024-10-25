package com.vipin.todo.app.backend.service;

import com.vipin.todo.app.backend.model.dto.AuthenticationResponseDto;
import com.vipin.todo.app.backend.model.dto.RegisterRequestDto;
import jakarta.servlet.http.HttpServletResponse;

public interface AuthenticationService {
    AuthenticationResponseDto register(RegisterRequestDto request, HttpServletResponse response);

    AuthenticationResponseDto authenticate(RegisterRequestDto request,HttpServletResponse response);
}