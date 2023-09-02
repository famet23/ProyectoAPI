package com.API.ProyectoAPI.Repository;

import com.API.ProyectoAPI.Modelo.Reclamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamoRepository extends JpaRepository<Reclamo, Integer> {
}