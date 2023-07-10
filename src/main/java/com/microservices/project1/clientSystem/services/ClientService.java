package com.microservices.project1.clientSystem.services;

import com.microservices.project1.clientSystem.models.Clients;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
    Flux<Clients> findAll();
    Mono<Clients> findById(Long id);
    Mono<Clients> save(Clients client);
    Mono<Clients> update(Long id, Clients client);
    Mono<Void> deleteById (Long id);
}
