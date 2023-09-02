package com.API.ProyectoAPI.Repository;

import com.API.ProyectoAPI.Modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, String> {
}