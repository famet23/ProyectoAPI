package com.API.ProyectoAPI.Repository;

import com.API.ProyectoAPI.Modelo.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadRepository extends JpaRepository<Unidad, Integer> {
}