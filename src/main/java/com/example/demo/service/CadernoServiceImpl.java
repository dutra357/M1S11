package com.example.demo.service;

import com.example.demo.repository.CadernoRepository;
import org.springframework.stereotype.Service;

@Service
public class CadernoServiceImpl {

    private final CadernoRepository repository;

    public CadernoServiceImpl(CadernoRepository repository) {
        this.repository = repository;
    }



}
