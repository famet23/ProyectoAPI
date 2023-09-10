package com.API.ProyectoAPI;
import com.API.ProyectoAPI.Modelo.Persona;
import com.API.ProyectoAPI.Repository.PersonaRepository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonaServiceTest {

    @Autowired
    private PersonaRepository personaRepository;

    @Test
    public void testGuardarPersona() {
        Persona persona = new Persona("1010101", "Andres", "Andres@uade.ar", "12345");
        Persona personaGuardada = personaRepository.save(persona);
        assertNotNull(personaGuardada);
    }
}