package com.API.ProyectoAPI.Excepciones;

import java.io.Serial;

public class UnidadException extends Exception {

    @Serial
    private static final long serialVersionUID = -1690698840733203643L;

    public UnidadException(String mensaje) {
        super(mensaje);
    }
}
