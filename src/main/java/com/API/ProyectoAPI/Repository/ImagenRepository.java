package com.API.ProyectoAPI.Repository;

import com.API.ProyectoAPI.Modelo.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepository extends JpaRepository<Imagen, Integer> {
}