package com.example.demo.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public ResponseEntity get(){
        return ResponseEntity.ok("teste get");
    }

    @PostMapping
    public ResponseEntity post(){
        return ResponseEntity.ok("teste post");
    }
    @DeleteMapping
    public ResponseEntity dell(){
        return ResponseEntity.ok("teste delete");
    }
    @PutMapping
    public ResponseEntity put(){
        return ResponseEntity.ok("teste put");
    }
}
