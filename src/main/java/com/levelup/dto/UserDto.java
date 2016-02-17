package com.levelup.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Class {@link com.levelup.dto.UserDto}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UserDto {

    private String pass;
    private String email;

    public UserDto() {
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
