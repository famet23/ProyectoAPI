package com.API.ProyectoAPI;

import com.API.ProyectoAPI.Modelo.Persona;
import com.API.ProyectoAPI.Repository.PersonaRepository;
import com.API.ProyectoAPI.Service.PersonaService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProyectoApiApplicationTests {

	Persona PersonaPrueba= new Persona("1010101", "Andres", "Andres@UADE.edu.co", null);

	@Test
	void contextLoads() {
	}


	@Test
	void registrarUsuario(){
		PersonaService personaService = new PersonaService();
		try {
			personaService.GuardarPersona(PersonaPrueba);
			System.out.println("la persona fue ingresada correctamente");
		}catch (Exception e){
			System.out.println("la persona fue no ingresada correctamente");

		}

	}



}
