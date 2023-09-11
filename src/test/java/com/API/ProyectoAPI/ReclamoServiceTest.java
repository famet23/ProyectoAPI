package com.API.ProyectoAPI;

import com.API.ProyectoAPI.Modelo.Reclamo;
import com.API.ProyectoAPI.Repository.ReclamoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ReclamoServiceTest {

    @Autowired
    ReclamoRepository reclamoRepository;

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
    private void test
}

