package com.example.demo.controller;
import com.example.demo.Entity.NotaEntity;
import com.example.demo.service.NotasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class NotaController {

    private final NotasService service;

    public NotaController(NotasService service) {
        this.service = service;
    }


    @GetMapping("{id}")
    public ResponseEntity<NotaEntity> getId(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }
    @GetMapping
    public ResponseEntity<List<NotaEntity>> get() {
        var resultado = service.getAll();
        return ResponseEntity.ok(resultado);
    }

    @PutMapping("{id}")
    public ResponseEntity<NotaEntity> put(@PathVariable Long id, @RequestBody NotaEntity request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> dell(@PathVariable Long id) {
        service.dell(id);
        return ResponseEntity.noContent().build();
    }
}
