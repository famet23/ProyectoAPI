package com.API.ProyectoAPI.Service;

import com.API.ProyectoAPI.Modelo.Unidad;
import com.API.ProyectoAPI.Repository.UnidadRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UnidadService {

    private final UnidadRepository unidadRepository;

    public Unidad guardarUnidad(Unidad unidad) {
        return unidadRepository.save(unidad);
    }

    public List<Unidad> obtenerTodasLasUnidades() {
        return unidadRepository.findAll();
    }

    public Optional<Unidad> obtenerUnidadPorId(Integer id) {
        return unidadRepository.findById(id);
    }

    public void eliminarUnidad(Integer id) {
        unidadRepository.deleteById(id);
    }
}
