package com.example.demo.repository;

import com.example.demo.Entity.CadernoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadernoRepository extends JpaRepository <CadernoEntity, Long> {
}
