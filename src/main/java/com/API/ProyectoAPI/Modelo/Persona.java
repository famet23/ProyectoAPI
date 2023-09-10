package com.API.ProyectoAPI.Modelo;

import jakarta.persistence.*;


@Entity
@Table(name = "personas")
public class Persona {

    @Id
    @Column(name = "documento", nullable = false, length = 20)
    private String Documento;

    @Column(name = "nombre", nullable = false, length = 100)
    private String Nombre;

    @Column(name="Mail", unique = true, length = 100)
    private String Mail;
    @Column(name = "contrasenia", length = 100)
    private String Contrasenia;

    public Persona(String documento, String nombre, String mail, String contrasenia) {
        Documento = documento;
        Nombre = nombre;
        Mail = mail;
        Contrasenia = contrasenia;
    }
    public Persona(){}

    public void cambiarPasword(String password) {
        this.Contrasenia = password;
    }



    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getContrasenia() {
        return Contrasenia;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "Documento='" + Documento + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Mail='" + Mail + '\'' +
                ", Contrasenia='" + Contrasenia + '\'' +
                '}';
    }
}