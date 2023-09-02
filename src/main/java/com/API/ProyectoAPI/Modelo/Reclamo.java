package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reclamo")
public class Reclamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReclamo", nullable = false)
    private Integer idReclamo;

    @Column(name = "ubicacion",length = 300)
    private String ubicacion;
    @Column(name = "descrpicion",length = 1000)
    private String descripcion;

    private int indentificador;



    @ManyToOne
    @JoinColumn(name = "Documento")
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "Codigo")
    private Edificio edificio;

}