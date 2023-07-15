package com.microservices.project1.clientSystem.services;

import com.microservices.project1.clientSystem.models.Clients;
import com.microservices.project1.clientSystem.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{

    @Autowired
    private final ClientRepository clientRepository;

    @Override
    public Flux<Clients> findAll() { return clientRepository.findAll(); }

    @Override
    public Mono<Clients> findById(Long id) { return clientRepository.findById(id); }

    @Override
    public Mono<Clients> save(Clients client) { return clientRepository.save(client); }

    @Override
    public Mono<Clients> update(Long id, Clients client) {
        return clientRepository.findById(id)
                .flatMap(existingClient -> {
                    existingClient.setFullName(client.getFullName());
                    existingClient.getClientType().setId(client.getClientType().getId());
                    existingClient.getClientType().setNameType(client.getClientType().getNameType());
                    return clientRepository.save(existingClient);
                        });
    }

    @Override
    public Mono<Void> deleteById(Long id) { return clientRepository.deleteById(id); }

    @Override
    public Flux<Clients> findByClientTypeId(Long typeId) { return clientRepository.findByClientTypeId(typeId); }
}
