package com.API.ProyectoAPI.Excepciones;

import java.io.Serial;

public class EdificioException extends Exception {

    @Serial
    private static final long serialVersionUID = 9018648492209155948L;

    public EdificioException(String mensaje) {
        super(mensaje);
    }
}
