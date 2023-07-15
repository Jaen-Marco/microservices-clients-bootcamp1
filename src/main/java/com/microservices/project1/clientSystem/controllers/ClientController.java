package com.microservices.project1.clientSystem.controllers;

import com.microservices.project1.clientSystem.models.Clients;
import com.microservices.project1.clientSystem.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public Flux<Clients> findAllC() { return clientService.findAll(); }

    @GetMapping("/{id}")
    public Mono<Clients> findByIdC(@PathVariable Long id) { return clientService.findById(id); }

    @PostMapping
    public Mono<Clients> saveC(@RequestBody Clients client) { return clientService.save(client); }

    @PutMapping("/{id}")
    public Mono<Clients> updateC(@PathVariable Long id ,@RequestBody Clients client) {
        return clientService.update(id, client);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteC(@PathVariable Long id) { return clientService.deleteById(id); }

    @GetMapping("/type/{typeId}")
    public Flux<Clients> findByTypeId(@PathVariable Long typeId) {return clientService.findByClientTypeId(typeId); }

}
