package com.microservices.project1.clientSystem.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientType {
    private Long id;
    private String nameType; //Personal(1) o Empresarial(2)
}
