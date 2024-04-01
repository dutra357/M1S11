package com.example.demo.service;

import com.example.demo.Entity.CadernoEntity;
import com.example.demo.repository.CadernoRepository;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.List;

@Service
public class CadernoServiceImpl implements CadernoService {

    private final CadernoRepository repository;
    public CadernoServiceImpl(CadernoRepository repository) {
        this.repository = repository;
    }


    @Override
    public CadernoEntity getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<CadernoEntity> getAll() {
        List<CadernoEntity> list = repository.findAll();
        return list;
    }

    @Override
    public CadernoEntity update(Long id, CadernoEntity caderno) {
        return repository.save(caderno);
    }

    @Override
    public void dell(Long id) {
        CadernoEntity caderno = getById(id);
        repository.delete(caderno);
    }
}
