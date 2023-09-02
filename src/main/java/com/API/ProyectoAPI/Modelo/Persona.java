package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data //Esta anotacion es utilizada para evitar escribir getters, setters, constructores y tostring
@Entity
@Table(name = "personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "documento", nullable = false, length = 20)
    private String Documento;

    @Column(name = "nombre", nullable = false, length = 100)
    private String Nombre;

    @Column(name="Mail", unique = true, length = 100)
    private String Mail;
    @Column(name = "contraseña", length = 100) //No seria mejr dejarlos notnull?
    private String Contraseña;



    //TODO duenios/inquilinos como agregacion



}