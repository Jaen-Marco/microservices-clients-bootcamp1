package com.microservices.project1.clientSystem.repositories;

import com.microservices.project1.clientSystem.models.Clients;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ClientRepository extends ReactiveCrudRepository<Clients,Long> {

    Flux<Clients> findByClientTypeId(Long typeId);
}
