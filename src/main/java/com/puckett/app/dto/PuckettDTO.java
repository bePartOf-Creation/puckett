package com.puckett.app.dto;

import com.puckett.app.models.Puckett;
import com.puckett.app.repository.PuckettRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Document
public class PuckettDTO {

    private String description;
    private String image;

}
