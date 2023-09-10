package com.API.ProyectoAPI;
import com.API.ProyectoAPI.Modelo.Persona;
import com.API.ProyectoAPI.Repository.PersonaRepository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PersonaServiceTest {

    @Autowired
    private PersonaRepository personaRepository;

    @Test
    public void testGuardarPersona() {
        Persona persona = new Persona("1010101", "Andreees", "Andres@uadee.ar", "12345678");
        Persona personaGuardada = personaRepository.save(persona);
        assertNotNull(personaGuardada);
    }

    @Test
    public void testGetAll() {
        List<Persona> personas = personaRepository.findAll();
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        assertNotNull(personas);
    }

    @Test
    public void testBusquedaId() {
        Persona persona = personaRepository.findById("1010101").get();
        System.out.println(persona);
        assertNotNull(persona);
    }

    @Test
    public void testEliminarPersona() {
        Persona persona = personaRepository.findById("1010101").get();
        System.out.println(persona);
        personaRepository.deleteById("1010101");
        assertNull(persona);
    }
}