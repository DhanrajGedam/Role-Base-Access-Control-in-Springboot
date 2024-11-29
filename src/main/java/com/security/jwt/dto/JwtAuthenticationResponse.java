package com.security.jwt.dto;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {
    private String token;
    //newely added
    private String firstName;

    // public void setFirstName(String firstName) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'setFirstName'");
    // }
}
