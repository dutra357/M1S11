package com.example.demo.service;

import com.example.demo.Entity.NotaEntity;
import com.example.demo.Entity.UsuarioEntity;

import java.util.List;

public interface UsuarioService {

    public List<UsuarioEntity> getAll();

    public UsuarioEntity getById(Long id);

    public UsuarioEntity update(Long id, UsuarioEntity caderno);

    void dell(Long id);
}
