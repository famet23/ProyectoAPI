package com.API.ProyectoAPI.Repository;

import com.API.ProyectoAPI.Modelo.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Integer> {
}