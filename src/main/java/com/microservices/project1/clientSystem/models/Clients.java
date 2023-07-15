package com.microservices.project1.clientSystem.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clients {

    @Id private Long id;
    private String fullName;
    private ClientType clientType;

}
