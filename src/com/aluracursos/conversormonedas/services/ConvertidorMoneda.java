package com.aluracursos.conversormonedas.services;

import com.aluracursos.conversormonedas.modelos.Moneda;

public class ConvertidorMoneda {

    private final ClienteConsultaApi consulta;
    private final ParserJsonMoneda parser;

    public ConvertidorMoneda(ClienteConsultaApi consulta, ParserJsonMoneda parser) {
        this.consulta = consulta;
        this.parser = parser;
    }

    public double convertirMoneda(String codigoOrigen, String codigoDestino, double monto) {
        // Obtener los datos de la API.
        String json = consulta.realizarSolicitud(codigoOrigen);
        Moneda respuesta = parser.parsearJson(json);

        // Obtener la tasa de cambio para el código de destino.
        Double tasaDestino = respuesta.getTasaCambio().get(codigoDestino);

        if(tasaDestino == null) {
            throw new IllegalArgumentException("Tasa de cambio no encontrada para: " + codigoDestino);
        }

        return monto * tasaDestino;
    }
}
