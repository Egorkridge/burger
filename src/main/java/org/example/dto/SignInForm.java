package org.example.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SignInForm {
    private String username;
    private String password;
}
