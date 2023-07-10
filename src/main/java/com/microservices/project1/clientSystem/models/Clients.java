package com.microservices.project1.clientSystem.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clients")
@Getter @Setter @NoArgsConstructor
public class Clients {

    @Id private Long id;
    private String fullName;
    private String type;

    public Clients(Long id, String fullName, String type) {
        this.id = id;
        this.fullName = fullName;
        this.type = type;
    }
}
