package com.API.ProyectoAPI;

import com.API.ProyectoAPI.Modelo.Persona;
import com.API.ProyectoAPI.Repository.EdificioRepository;
import com.API.ProyectoAPI.Repository.ImagenRepository;
import com.API.ProyectoAPI.Repository.PersonaRepository;
import com.API.ProyectoAPI.Service.PersonaService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProyectoApiApplicationTests {




	@Test
	void contextLoads() {
		Persona persona = new persona();
		persona.setDocumento("12345678")
		Persona.setNombre("juan")
		persona.setDireccion("Calle 123")
		persona.setNumero("123456789")
		persona.setMail("juanperez@gmail.com")
	
	}

}
