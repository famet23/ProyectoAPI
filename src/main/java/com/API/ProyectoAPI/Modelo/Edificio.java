package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "edificios")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false)
    private Integer Codigo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String Nombre;
    @Column(name = "direccion", nullable = false, length = 100)
    private String Direccion;



}