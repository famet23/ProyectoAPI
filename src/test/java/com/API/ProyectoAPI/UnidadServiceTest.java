package com.API.ProyectoAPI;

import com.API.ProyectoAPI.Excepciones.UnidadException;
import com.API.ProyectoAPI.Modelo.Persona;
import com.API.ProyectoAPI.Modelo.Unidad;
import com.API.ProyectoAPI.Repository.PersonaRepository;
import com.API.ProyectoAPI.Repository.UnidadRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UnidadServiceTest {

    @Autowired
    UnidadRepository unidadRepository;

    @Autowired
    PersonaRepository personaRepository;
    @Test
    private void testDueniosPorUnidad(){
        int identificador=1;
        Unidad unidad = unidadRepository.findById(identificador).get();

        List<Persona> duenios= unidad.getDuenio();

        for(Persona duenio: duenios)
            System.out.println(duenio);
        assertNotNull(duenios);
    }

    @Test
    private void testInquilinosPorUnidad(){
        int identificador=1;
        Unidad unidad = unidadRepository.findById(identificador).get();

        List<Persona> inquilinos= unidad.getInquilino();

        for(Persona inquilino: inquilinos)
            System.out.println(inquilino);
        assertNotNull(inquilinos);
    }

    //A partir de aqui toca hallar la manera de
    // realizar el assert para cada metodo y asi verificar si el test funciona
    //Tambien ver como funcionan las excepciones
    @Test
    private  void testTransferirUnidad(){
        int identificador=1;
        String documento="1010101";
        Unidad unidad = unidadRepository.findById(identificador).get();
        Persona persona = personaRepository.findById(documento).get();

        unidad.transferir(persona);
    }

    @Test
    private  void testAgregarDuenio(){
        int identificador=1;
        String documento="1010101";
        Unidad unidad = unidadRepository.findById(identificador).get();
        Persona persona = personaRepository.findById(documento).get();

        unidad.agregarDuenio(persona);
    }

    @Test
    private void testAlquilarUnidad() throws UnidadException {
        int identificador=1;
        String documento="1010101";
        Unidad unidad = unidadRepository.findById(identificador).get();
        Persona persona = personaRepository.findById(documento).get();

        unidad.alquilar(persona);
    }
    @Test
    private  void testAgregarInquilinoUnidad(){
        int identificador=1;
        String documento="1010101";
        Unidad unidad = unidadRepository.findById(identificador).get();
        Persona persona = personaRepository.findById(documento).get();

        unidad.agregarInquilino(persona);
    }

    @Test
    private void testLiberarUnidad(){
        int identificador=1;
        Unidad unidad = unidadRepository.findById(identificador).get();
        unidad.liberar();
    }

    @Test
    private void testHabitarUnidad() throws UnidadException {
        int identificador=1;
        Unidad unidad = unidadRepository.findById(identificador).get();
        unidad.habitar();
    }
}
