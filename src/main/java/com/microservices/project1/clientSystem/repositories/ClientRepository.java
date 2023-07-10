package com.microservices.project1.clientSystem.repositories;

import com.microservices.project1.clientSystem.models.Clients;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ClientRepository extends ReactiveCrudRepository<Clients,Long> {
}
