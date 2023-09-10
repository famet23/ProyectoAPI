package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Esta anotacion es utilizada para evitar escribir getters, setters, constructores y tostring
@Entity
@Table(name = "personas")
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "documento", nullable = false, length = 20)
    private String Documento;

    @Column(name = "nombre", nullable = false, length = 100)
    private String Nombre;

    @Column(name="Mail", unique = true, length = 100)
    private String Mail;
    @Column(name = "contraseña", length = 100)
    private String Contrasenia;





}