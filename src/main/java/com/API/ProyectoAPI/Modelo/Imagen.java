package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;


@Entity
@Table(name = "imagenes")
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "path", nullable = false, length = 300)
    private String path;
    @Column(name = "tipo", length = 10)
    private String tipo;

    public Imagen(String path, String tipo) {
        this.path = path;
        this.tipo = tipo;
    }
    public Imagen(){}

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "numero=" + numero +
                ", path='" + path + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}