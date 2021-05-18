package com.puckett.app.dto;

import com.puckett.app.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
public class UserDTO {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;

}


