package com.aluracursos.conversormonedas.services;

import com.aluracursos.conversormonedas.modelos.Moneda;
import com.aluracursos.conversormonedas.modelos.MonedaExchangeRate;
import com.google.gson.Gson;

public class ParserJsonMoneda {
    private final Gson gson = new Gson();

    public Moneda parsearJson(String json) {
        // JSON al record.
        MonedaExchangeRate monedaExchangeRate = gson.fromJson(json, MonedaExchangeRate.class);
        // Convierte el record a la clase Moneda.
        return new Moneda(monedaExchangeRate.base_code(), monedaExchangeRate.conversion_rates());
    }

}
