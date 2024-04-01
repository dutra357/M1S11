package com.example.demo.controller;

import com.example.demo.service.CadernoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CadernoController {

    private final CadernoService service;

    public CadernoController(CadernoService service) {
        this.service = service;
    }


    @GetMapping("{id}")
    public ResponseEntity<AlunoDto> getId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorIdDto(id));
    }
    @GetMapping
    public ResponseEntity<List<AlunoDto>> get() {
        var resultado = service.buscarTodos();
        return ResponseEntity.ok(resultado);
    }

    @PutMapping("{id}")
    public ResponseEntity<AlunoEntity> put(@PathVariable Long id, @RequestBody AlunoEntity request) {
        return ResponseEntity.ok(service.alterar(id, request));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> dell(@PathVariable Long id) {
        service.dell(id);
        return ResponseEntity.noContent().build();
    }
}
