package com.example.demo.service;

import com.example.demo.Entity.NotaEntity;
import com.example.demo.Entity.UsuarioEntity;
import com.example.demo.repository.NotaRepository;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;
    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }


    @Override
    public UsuarioEntity getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<UsuarioEntity> getAll() {
        List<UsuarioEntity> list = repository.findAll();
        return list;
    }

    @Override
    public UsuarioEntity update(Long id, UsuarioEntity caderno) {
        return repository.save(caderno);
    }

    @Override
    public void dell(Long id) {
        UsuarioEntity usuario = getById(id);
        repository.delete(usuario);
    }
}
