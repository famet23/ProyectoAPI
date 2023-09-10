package com.API.ProyectoAPI.Modelo;

import com.API.ProyectoAPI.Excepciones.UnidadException;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "unidades")
public class Unidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "identificador", nullable = false)
    private Integer identificador;
    @Column(name = "piso", nullable = false, length = 5)
    private int piso;
    @Column(name = "numero", nullable = false, length = 10)
    private int numero;
    @Column(name = "habitado", nullable = false)//No se comprende por que en la base de datos esta como string
    private Boolean habitado;

    @ManyToOne
    private Edificio edificio;




    @ManyToMany
    @JoinTable(name ="Duenios",
            joinColumns = @JoinColumn(name = "identificador"),
            inverseJoinColumns = @JoinColumn(name = "documento"))
    private List<Persona> duenios;

    @ManyToMany
    @JoinTable(name ="Inquilinos",
            joinColumns = @JoinColumn(name = "identificador"),
            inverseJoinColumns = @JoinColumn(name = "documento"))
    private List<Persona> inquilinos;


    public Unidad(Integer identificador, int piso, int numero, Edificio edificio) {
        this.identificador = identificador;
        this.piso = piso;
        this.numero = numero;
        this.habitado = false;
        this.edificio = edificio;
        this.duenios = new ArrayList<Persona>();
        this.inquilinos = new ArrayList<Persona>();

    }

    public Unidad() {
    }

    public void transferir(Persona nuevoDuenio) {
        duenios = new ArrayList<Persona>();
        duenios.add(nuevoDuenio);
    }

    public void agregarDuenio(Persona duenio) {
        duenios.add(duenio);
    }

    public void alquilar(Persona inquilino) throws UnidadException {
        if(!this.habitado) {
            this.habitado = true;
            inquilinos = new ArrayList<Persona>();
            inquilinos.add(inquilino);
        }
        else
            throw new UnidadException("La unidad esta ocupada");
    }
    public void agregarInquilino(Persona inquilino) {
        inquilinos.add(inquilino);
    }

    public boolean estaHabitado() {
        return habitado;
    }

    public void liberar() {
        this.inquilinos = new ArrayList<Persona>();
        this.habitado = false;
    }

    public void habitar() throws UnidadException {
        if(this.habitado)
            throw new UnidadException("La unidad ya esta habitada");
        else
            this.habitado = true;
    }



    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean getHabilitado() {
        return habitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habitado = habilitado;
    }

    public List<Persona> getDuenio() {
        return duenios;
    }

    public void setDuenio(List<Persona> duenio) {
        duenios = duenio;
    }

    public List<Persona> getInquilino() {
        return inquilinos;
    }

    public void setInquilino(List<Persona> inquilino) {
        this.inquilinos = inquilino;
    }

    @Override
    public String toString() {
        return "Unidad{" +
                "identificador=" + identificador +
                ", piso=" + piso +
                ", numero=" + numero +
                ", habitado=" + habitado +
                ", edificio=" + edificio +
                ", duenios=" + duenios +
                ", inquilinos=" + inquilinos +
                '}';
    }
}