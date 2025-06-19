package com.aluracursos.conversormonedas.modelos;

import java.util.Map;

public class Moneda {
    private String codigo; // Por ejemplo "USD", "ARS".
    private Map<String, Double> tasaCambio;

    public String getCodigo() {
        return codigo;
    }

    public Map<String, Double> getTasaCambio() {
        return tasaCambio;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "codigo='" + codigo + '\'' +
                ", tasaCambio=" + tasaCambio +
                '}';
    }
}
