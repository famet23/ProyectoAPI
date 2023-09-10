package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "unidades")
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

    @ManyToMany
    @JoinTable(name ="Duenios",
            joinColumns = @JoinColumn(name = "identificador"),
            inverseJoinColumns = @JoinColumn(name = "documento"))
    private List<Persona> Duenio;

    @ManyToMany
    @JoinTable(name ="Inquilinos",
            joinColumns = @JoinColumn(name = "identificador"),
            inverseJoinColumns = @JoinColumn(name = "documento"))
    private List<Persona> inquilino;



}