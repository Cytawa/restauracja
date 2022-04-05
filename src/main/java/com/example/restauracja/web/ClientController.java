package com.example.restauracja.web;


import com.example.restauracja.entities.Client;
import com.example.restauracja.entities.Employee;
import com.example.restauracja.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant/client")
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/{id}")
    public ResponseEntity<Client> getById(@PathVariable final Long id) {
        return ResponseEntity.ok(clientService.findById(id));
    }

    @GetMapping
    public List<Client> findAll() {
        return clientService.findAll();
    }


    @PostMapping
    public ResponseEntity<Client> save(@RequestBody final Client client) {
        return ResponseEntity.ok(clientService.save(client));
    }

    @PostMapping("/{id}")
    public ResponseEntity<Client> saveRandomEmployee(@PathVariable final Long id) {
        return ResponseEntity.ok(clientService.saveRandomEmployee(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable final Long id) {
        return ResponseEntity.ok(clientService.deleteById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> saveEmployee(@PathVariable final Long id, @RequestBody Employee employee) {
        return ResponseEntity.ok(clientService.saveEmployee(id,employee));
    }


}
