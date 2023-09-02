package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "imagen")
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "path", nullable = false, length = 300)
    private String path;
    @Column(name = "tipo", nullable = false, length = 10)
    private String tipo;

    //TODO foreing key reclamo relacion n-1

}