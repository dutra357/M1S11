package com.example.demo.service;
import com.example.demo.Entity.NotaEntity;
import java.util.List;

public interface NotasService {

    public List<NotaEntity> getAll();

    public NotaEntity getById(Long id);

    public NotaEntity update(Long id, NotaEntity caderno);

    void dell(Long id);
}
