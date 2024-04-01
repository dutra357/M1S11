package com.example.demo.service;

import com.example.demo.Entity.CadernoEntity;
import com.example.demo.Entity.NotaEntity;
import com.example.demo.repository.CadernoRepository;
import com.example.demo.repository.NotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaServiceImpl implements NotasService {

    private final NotaRepository repository;
    public NotaServiceImpl(NotaRepository repository) {
        this.repository = repository;
    }


    @Override
    public NotaEntity getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<NotaEntity> getAll() {
        List<NotaEntity> list = repository.findAll();
        return list;
    }

    @Override
    public NotaEntity update(Long id, NotaEntity caderno) {
        return repository.save(caderno);
    }

    @Override
    public void dell(Long id) {
        NotaEntity nota = getById(id);
        repository.delete(nota);
    }
}
