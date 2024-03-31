package com.example.demo.repository;

import com.example.demo.Entity.NotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<NotaEntity, Long> {
}
