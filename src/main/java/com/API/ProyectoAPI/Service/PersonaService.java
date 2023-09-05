package com.API.ProyectoAPI.Service;


import com.API.ProyectoAPI.Modelo.Persona;
import com.API.ProyectoAPI.Repository.PersonaRepository;
import lombok.AllArgsConstructor;
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

    //posible exception throw si no se encuentra id o es de otro tipo
    public Optional<Persona> BusquedaId(String id){
        return personaRepository.findById(id);
    }

    public void EliminarPersona(String id){
        personaRepository.deleteById(id);
    }

}
