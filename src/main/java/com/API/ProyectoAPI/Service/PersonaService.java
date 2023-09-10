package com.API.ProyectoAPI.Service;


import com.API.ProyectoAPI.Modelo.Persona;
import com.API.ProyectoAPI.Repository.PersonaRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PersonaService {

    /*private final PersonaRepository personaRepository;

    Constructor que toma PersonaRepository como argumento
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

     */
    private PersonaRepository personaRepository;

    // Setter para PersonaRepository
    public void setPersonaRepository(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

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
