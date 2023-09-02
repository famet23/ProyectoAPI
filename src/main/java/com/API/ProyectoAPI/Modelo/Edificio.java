package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "edificio")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false)
    private Integer Codigo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String Nombre;
    @Column(name = "direccion", nullable = false, length = 100)
    private String Direccion;

    //TODO relacionar con tabla edificios 1-n
    //TODO relacionar con reclamos 1-1
}