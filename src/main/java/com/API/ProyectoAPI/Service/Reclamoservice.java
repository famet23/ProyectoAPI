package com.API.ProyectoAPI.Service;

import com.API.ProyectoAPI.Modelo.Reclamo;
import com.API.ProyectoAPI.Repository.ReclamoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReclamoService {

    private final ReclamoRepository reclamoRepository;

    public Reclamo guardarReclamo(Reclamo reclamo) {
        return reclamoRepository.save(reclamo);
    }

    public List<Reclamo> obtenerTodosLosReclamos() {
        return reclamoRepository.findAll();
    }

    public Optional<Reclamo> obtenerReclamoPorId(String id) {
        return reclamoRepository.findById(id);
    }

    public void eliminarReclamo(String id) {
        reclamoRepository.deleteById(id);
    }
}
