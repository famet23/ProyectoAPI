package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data //Esta anotacion es utilizada para evitar escribir getters, setters, constructores y tostring
@Entity
@Table(name = "personas")
public class Persona {
    @Id
    @Column(name = "documento", nullable = false, length = 20)
    private String Documento;

    @Column(name = "nombre", nullable = false, length = 100)
    private String Nombre;

    @Column(name="Mail", unique = true, nullable = false, length = 100)//Mail y contraseña pueden ser nullos??
    private String Mail;
    @Column(name = "contraseña", nullable = false, length = 100)
    private String Contraseña;

    //todo relacionar con tablas reclamos 1-n, y duenios/inquilinos como agregacion 1-1



}