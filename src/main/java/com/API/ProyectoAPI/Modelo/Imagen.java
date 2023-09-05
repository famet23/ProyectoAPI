package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "imagen")
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "path", nullable = false, length = 300)
    private String path;
    @Column(name = "tipo", length = 10)
    private String tipo;


    @OneToOne
    @JoinColumn(name= "idReclamo")
    private Reclamo reclamo;

}