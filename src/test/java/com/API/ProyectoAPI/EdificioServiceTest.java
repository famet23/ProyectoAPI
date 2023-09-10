package com.API.ProyectoAPI;

import com.API.ProyectoAPI.Modelo.Edificio;
import com.API.ProyectoAPI.Modelo.Persona;
import com.API.ProyectoAPI.Repository.EdificioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class EdificioServiceTest {

    @Autowired
    EdificioRepository edificioRepository;

    @Test
    public void testGetAll() {
        List<Edificio> edificios = edificioRepository.findAll();
        for (Edificio edificio : edificios) {
            System.out.println(edificio);
        }
        assertNotNull(edificios);
    }

    @Test
    public  void testHabilitadosPosEdificio(){
            int codigo=1;
            Edificio edificio = edificioRepository.findById(codigo).get();

            Set<Persona> habilitados = edificio.habilitados();
            for(Persona habilitado: habilitados){
                System.out.println(habilitado);
            }
            assertNotNull(habilitados);
    }

    @Test
    public  void testDueniosPorEdificio(){
        int codigo=1;
        Edificio edificio = edificioRepository.findById(codigo).get();

        Set<Persona> duenios = edificio.duenios();
        for(Persona duenio: duenios){
            System.out.println(duenio);
        }
        assertNotNull(duenios);
    }

    @Test
    public  void testHabitantesPorEdificio(){
        int codigo=1;
        Edificio edificio = edificioRepository.findById(codigo).get();

        Set<Persona> habitantes = edificio.habitantes();
        for(Persona habitante: habitantes){
            System.out.println(habitante);
        }
        assertNotNull(habitantes);
    }

}
