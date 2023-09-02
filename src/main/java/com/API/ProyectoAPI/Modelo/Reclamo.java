package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reclamo")
public class Reclamo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Reclamo_SEQ")
    @SequenceGenerator(name = "Reclamo_SEQ")
    @Column(name = "idReclamo", nullable = false)
    private Integer idReclamo;

    @Column(name = "ubicacion", nullable = false, length = 300)
    private String ubicacion;
    @Column(name = "descrpicion", nullable = false,length = 1000)
    private String descripcion;


    //TODO foreing key personas relacion 1-1
    //TODO foreing key edificio relacion 1-1

}