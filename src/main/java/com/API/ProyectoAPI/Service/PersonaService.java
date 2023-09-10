package com.API.ProyectoAPI.Service;


import com.API.ProyectoAPI.Modelo.Persona;
import com.API.ProyectoAPI.Repository.ImagenRepository;
import com.API.ProyectoAPI.Repository.PersonaRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonaService {

    private final PersonaRepository personaRepository;



    public Persona GuardarPersona(Persona persona){
        return personaRepository.save(persona);
    }

    public List<Persona> GetAll(){
        return personaRepository.findAll();
    }

    public Optional<Persona> BusquedaId(String id){
        return personaRepository.findById(id);
    }

    public void EliminarPersona(String id){
        personaRepository.deleteById(id);
    }


}
