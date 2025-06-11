package com.aluracursos.conversormonedas.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ApiCliente {

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://foo.com/"))
            .build();

}
