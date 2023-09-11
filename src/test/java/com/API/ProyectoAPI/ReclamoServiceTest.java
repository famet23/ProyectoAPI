package com.API.ProyectoAPI;

import com.API.ProyectoAPI.Modelo.*;
import com.API.ProyectoAPI.Repository.EdificioRepository;
import com.API.ProyectoAPI.Repository.PersonaRepository;
import com.API.ProyectoAPI.Repository.ReclamoRepository;
import com.API.ProyectoAPI.Repository.UnidadRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

    //verificar la manera de buscarlo por codigo de edificio
    @Test
    private void testReclamosPorEdificio(){
        //TODO Reclamo reclamo = reclamoRepository.
    }
    @Test
    private void testReclamosPorUnidad(){
        //TODO encontrar la manera de buscarlo por identificador de unidad
    }

    @Test
    private void testReclamosPorNumero(){
        Reclamo reclamo = reclamoRepository.findById(1).get();
        System.out.println(reclamo);
        assertNotNull(reclamo);

    }
    @Test
    private void testReclamosPosNumero(){
        //TODO encontrar la manera de hacerlo
    }

    @Test
    private void testAgregarReclamo(){
        Persona persona = personaRepository.findById("1010101").get();
        Edificio edificio = edificioRepository.findById(1).get();
        Unidad unidad = unidadRepository.findById(1).get();
        Reclamo reclamo = new Reclamo(persona,edificio, "Mogliani 425", "Goteras", unidad);
        Reclamo reclamoGuardada = reclamoRepository.save(reclamo);
        assertNotNull(reclamoGuardada);
    }
    @Test
    private void testAgregarImagenReclamo(){
        Persona persona = personaRepository.findById("1010101").get();
        Edificio edificio = edificioRepository.findById(1).get();
        Unidad unidad = unidadRepository.findById(1).get();
        Reclamo reclamo = new Reclamo(persona,edificio, "Mogliani 425", "Goteras", unidad);
        //como probar este metodo?
        reclamo.agregarImagen("direccion", "Tipo");
    }

    @Test
    private void testCambiarEstado(){
        Reclamo reclamo = reclamoRepository.findById(1).get();
        reclamo.cambiarEstado(Estado.desestimado);
    }
}

