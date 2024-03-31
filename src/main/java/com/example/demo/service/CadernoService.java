package com.example.demo.service;

import com.example.demo.Entity.CadernoEntity;

import java.util.List;

public interface CadernoService {

    public List<CadernoEntity> getAll();

    public CadernoEntity getById(Long id);

    public CadernoEntity update(Long id);

    void dell(Long id);
}
