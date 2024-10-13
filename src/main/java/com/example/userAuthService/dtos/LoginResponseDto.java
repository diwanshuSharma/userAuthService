package com.example.userAuthService.dtos;

import com.example.userAuthService.dtos.enums.RequestStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDto {
    private RequestStatus requestStatus;
}
