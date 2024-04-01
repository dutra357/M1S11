package com.example.demo.controller;
import com.example.demo.Entity.CadernoEntity;
import com.example.demo.service.CadernoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("cadernos")
public class CadernoController {

    private final CadernoService service;

    public CadernoController(CadernoService service) {
        this.service = service;
    }


    @GetMapping("{id}")
    public ResponseEntity<CadernoEntity> getId(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }
    @GetMapping
    public ResponseEntity<List<CadernoEntity>> get() {
        var resultado = service.getAll();
        return ResponseEntity.ok(resultado);
    }

    @PutMapping("{id}")
    public ResponseEntity<CadernoEntity> put(@PathVariable Long id, @RequestBody CadernoEntity request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> dell(@PathVariable Long id) {
        service.dell(id);
        return ResponseEntity.noContent().build();
    }
}
