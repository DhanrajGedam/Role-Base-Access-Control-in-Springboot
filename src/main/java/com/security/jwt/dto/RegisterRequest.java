package com.security.jwt.dto;

import com.security.jwt.model.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
  //  private Role role;
    //new added 
    private String division;
    private String department;
    private String module;// if needed change data type
    private String middleName;
     @Default private String role = "user";
}
