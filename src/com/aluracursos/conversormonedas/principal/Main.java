package com.aluracursos.conversormonedas.principal;

import com.aluracursos.conversormonedas.services.ApiCliente;
import com.aluracursos.conversormonedas.ui.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputTeclado = new Scanner(System.in);
        int opcion = 0;

        Menu menu = new Menu(inputTeclado, opcion);
        menu.mostrarMenu();

        ApiCliente apiCliente = new ApiCliente();
        try {
            String respuesta = apiCliente.realizarSolicitud();
            System.out.println(respuesta);
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al realizar la solicitud: " + e.getMessage());
        }


    }
}