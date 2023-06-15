package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.ArtistaEntity;

public interface ArtistaRepository extends JpaRepository <ArtistaEntity, Integer> {

}
