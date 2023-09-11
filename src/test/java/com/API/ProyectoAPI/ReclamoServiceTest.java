package com.API.ProyectoAPI;

import com.API.ProyectoAPI.Modelo.*;
import com.API.ProyectoAPI.Repository.EdificioRepository;
import com.API.ProyectoAPI.Repository.PersonaRepository;
import com.API.ProyectoAPI.Repository.ReclamoRepository;
import com.API.ProyectoAPI.Repository.UnidadRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ReclamoServiceTest {

    @Autowired
    ReclamoRepository reclamoRepository;

    @Autowired
    PersonaRepository personaRepository;

    @Autowired
    EdificioRepository edificioRepository;

    @Autowired
    UnidadRepository unidadRepository;

    @Test
    public void testReclamosPorEdificio(){
        //encuentra los reclamos por edificio
        Edificio edificio = edificioRepository.findById(1).get();
        System.out.println(edificio);
        List<Reclamo> reclamos = reclamoRepository.findAll();
        for(Reclamo reclamo: reclamos) {
            if (reclamo.getEdificio().equals(edificio)) {
                System.out.println(reclamo);
            }
        }

        assert (reclamos.size() > 0);
    }
    @Test
    public void testReclamosPorUnidad(){
        //encuentra los reclamos por unidad
        Unidad unidad = unidadRepository.findById(1).get();
        System.out.println(unidad);
        List<Reclamo> reclamos = reclamoRepository.findAll();
        for(Reclamo reclamo: reclamos) {
            if (reclamo.getUnidad().equals(unidad)) {
                System.out.println(reclamo);
            }
        }

        assert (reclamos.size() > 0);
    }

    @Test
    public void testReclamosPorNumero(){
        Reclamo reclamo = reclamoRepository.findById(1).get();
        System.out.println(reclamo);
        assertNotNull(reclamo);

    }
    @Test
    public void testAgregarReclamo(){
        Persona persona = personaRepository.findById("1010101").get();
        Edificio edificio = edificioRepository.findById(1).get();
        Unidad unidad = unidadRepository.findById(1).get();
        Reclamo reclamo = new Reclamo(persona, edificio, "Mogliani 425", "Goteras", unidad);
        Reclamo reclamoGuardada = reclamoRepository.save(reclamo);
        assertNotNull(reclamoGuardada);
    }
    @Test
    public void testAgregarImagenReclamo(){
        Persona persona = personaRepository.findById("1010101").get();
        Edificio edificio = edificioRepository.findById(1).get();
        Unidad unidad = unidadRepository.findById(1).get();
        Reclamo reclamo = new Reclamo(persona, edificio, "Mogliani 425", "Goteras", unidad);
        reclamo.agregarImagen("direccion", "Tipo");
        assertNotNull(reclamo.getImagenes());
    }

    @Test
    public void testCambiarEstado(){
        Reclamo reclamo = reclamoRepository.findById(1).get();
        reclamo.cambiarEstado(Estado.desestimado);
        assertNotNull(reclamo.getEstado());
    }
}

