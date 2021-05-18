package com.puckett.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data


public class Puckett {
    @Id
    private String puckettId;
    private String description;
    private String image;
}
