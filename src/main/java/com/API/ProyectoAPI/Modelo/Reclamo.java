package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "reclamos")

public class Reclamo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idReclamo", nullable = false)
    private Integer numero;

    @Column(name = "ubicacion",length = 300)
    private String ubicacion;
    @Column(name = "descripicion",length = 1000)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "identificador")//Segun las clases la relacion tablien deberia estar con unidad
    private Unidad unidad;

    @OneToMany
    private List<Imagen> imagenes;

    private Estado estado;//existe una relacion con este enumerable??

    @ManyToOne
    @JoinColumn(name = "Documento")
    private Persona usuario;
    @ManyToOne
    @JoinColumn(name = "Codigo")
    private Edificio edificio;

    public Reclamo(Persona usuario, Edificio edificio, String ubicacion, String descripcion, Unidad unidad) {
        this.usuario = usuario;
        this.edificio = edificio;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.estado = Estado.nuevo;
        imagenes = new ArrayList<Imagen>();
    }
    public Reclamo(){}

    public void agregarImagen(String direccion, String tipo) {
        Imagen imagen = new Imagen(direccion,tipo);
        imagenes.add(imagen);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Edificio getEdificio() {
        return this.edificio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public List<Imagen> getImagenes(){
        return this.imagenes;
    }

    public void cambiarEstado(Estado estado) {
        this.estado = estado;
    }
}