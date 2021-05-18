package com.puckett.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {

    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
    private Role userRole;

}
