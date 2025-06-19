package com.aluracursos.conversormonedas.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Maneja la comunicación con la API. Construye y envía solicitudes HTTP, recibe respuestas y retorna esos datos.
public class ApiCliente {

    public String realizarSolicitud(String codigo) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c0f721f8d32cb457e6e9ec32/latest/" + codigo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
        System.out.println(json);

        return json;
        //return new Gson().fromJson(response.body(), Moneda.class);
    }
}