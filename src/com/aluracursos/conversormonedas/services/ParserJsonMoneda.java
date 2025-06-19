package com.aluracursos.conversormonedas.services;

import com.aluracursos.conversormonedas.modelos.Moneda;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ParserJsonMoneda {

    public Moneda parsearJson(String json) {
        Gson gson = new Gson();
        return new Gson().fromJson(json, Moneda.class);
    }
    //Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
}
