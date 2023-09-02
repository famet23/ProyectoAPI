package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "unidad")
public class Unidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identificador", nullable = false)
    private Integer identificador;
    @Column(name = "piso", nullable = false, length = 5)
    private int piso;
    @Column(name = "numero", nullable = false, length = 10)
    private int numero;
    @Column(name = "habilitado", nullable = false, length = 1)
    private String habilitado="";


    @ManyToOne
    @JoinColumn(name ="CodigoEdificio",referencedColumnName = "Codigo")
    private Edificio edificio;

   //todo relacionar con tablas duenios/inquilinos como tablas de agregacion

}