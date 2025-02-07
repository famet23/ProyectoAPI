package com.API.ProyectoAPI.Service;

import com.API.ProyectoAPI.Modelo.Imagen;
import com.API.ProyectoAPI.Repository.ImagenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ImagenService {

    private final ImagenRepository imagenRepository;

    public Imagen guardarImagen(Imagen imagen) {
        return imagenRepository.save(imagen);
    }

    public List<Imagen> obtenerTodasLasImagenes() {
        return imagenRepository.findAll();
    }

    public Optional<Imagen> obtenerImagenPorId(Integer id) {
        return imagenRepository.findById(id);
    }

    public void eliminarImagen(Integer id) {
        imagenRepository.deleteById(id);
    }
}
