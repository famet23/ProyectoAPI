package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "reclamos")
@AllArgsConstructor
@NoArgsConstructor
public class Reclamo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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