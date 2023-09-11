package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "edificios")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codigo", nullable = false)
    private Integer Codigo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String Nombre;
    @Column(name = "direccion", nullable = false, length = 100)
    private String Direccion;

    @OneToMany
    @JoinTable(name = "unidades",
            joinColumns = @JoinColumn(name = "codigo"),
            inverseJoinColumns = @JoinColumn(name = "codigoEdificio"))
    private List<Unidad> unidades;

    public Edificio(Integer codigo, String nombre, String direccion) {
        this.Codigo = codigo;
        this.Nombre = nombre;
        this.Direccion = direccion;
        unidades = new ArrayList<Unidad>()  ;
    }
    public Edificio(){

    }

    public void agregarUnidad(Unidad unidad) {
        unidades.add(unidad);
    }



    public Set<Persona> habilitados(){
        Set<Persona> habilitados = new HashSet<Persona>();
        for(Unidad unidad : unidades) {
            List<Persona> duenios = unidad.getDuenio();
            for(Persona p : duenios)
                habilitados.add(p);
            List<Persona> inquilinos = unidad.getInquilino();
            for(Persona p : inquilinos)
                habilitados.add(p);
        }
        return habilitados;
    }

    public Set<Persona> duenios() {
        Set<Persona> resultado = new HashSet<Persona>();
        for(Unidad unidad : unidades) {
            List<Persona> duenios = unidad.getDuenio();
            for(Persona p : duenios)
                duenios.add(p);
        }
        return resultado;
    }

    public Set<Persona> habitantes() {
        Set<Persona> resultado = new HashSet<Persona>();
        for(Unidad unidad : unidades) {
            if(unidad.estaHabitado()) {
                List<Persona> inquilinos = unidad.getInquilino();
                if(inquilinos.size() > 0)
                    for(Persona p : inquilinos)
                        resultado.add(p);
                else {
                    List<Persona> duenios = unidad.getDuenio();
                    for(Persona p : duenios)
                        resultado.add(p);
                }
            }
        }
        return resultado;
    }



    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public List<Unidad> getUnidades() {
        return unidades;
    }


    @Override
    public String toString() {
        return "Edificio{" +
                "Codigo=" + Codigo +
                ", Nombre='" + Nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", unidades=" + unidades +
                '}';
    }
}