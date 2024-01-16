package org.launchcode.rootstar.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class LoginFormDTO {

    @NotNull(message = "Username is required")
    @NotBlank (message = "Field can not be blank")
    @Size(min = 3, max = 20, message = "Username must be between 3-20 characters long")
    private String username;



    @NotNull(message = "Password is required")
    @NotBlank (message = "Field can not be blank")
    @Size(min = 9, max = 20, message = "Password must be between 9-20 characters long")
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
