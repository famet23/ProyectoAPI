package com.API.ProyectoAPI.Service;

import com.API.ProyectoAPI.Modelo.Edificio;
import com.API.ProyectoAPI.Repository.EdificioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EdificioService {

    private final EdificioRepository edificioRepository;

    public Edificio guardarEdificio(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    public List<Edificio> obtenerTodosLosEdificios() {
        return edificioRepository.findAll();
    }

    public Optional<Edificio> obtenerEdificioPorId(Integer id) {
        return edificioRepository.findById(id);
    }

    public void eliminarEdificio(Integer id) {
        edificioRepository.deleteById(id);
    }
}

