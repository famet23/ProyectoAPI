package com.API.ProyectoAPI.Excepciones;

import java.io.Serial;

public class ImagenException extends Exception {

    @Serial
    private static final long serialVersionUID = 6332415080946078382L;

    public ImagenException(String mensaje) {
        super(mensaje);
    }
}
