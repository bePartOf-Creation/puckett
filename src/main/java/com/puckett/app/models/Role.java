package com.puckett.app.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Role {
    @Id
    private String roleId;
    private  String roleName;

}
