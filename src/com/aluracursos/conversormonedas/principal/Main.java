package com.aluracursos.conversormonedas.principal;

import com.aluracursos.conversormonedas.modelos.Moneda;
import com.aluracursos.conversormonedas.services.ClienteConsultaApi;
import com.aluracursos.conversormonedas.services.ParserJsonMoneda;
import com.aluracursos.conversormonedas.ui.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputTeclado = new Scanner(System.in);
        int opcion = 0;

        Menu menu = new Menu(inputTeclado, opcion);
        menu.mostrarMenu();

        ClienteConsultaApi consulta = new ClienteConsultaApi();
        ParserJsonMoneda parser = new ParserJsonMoneda();

        String json = consulta.realizarSolicitud("USD");
        Moneda moneda = parser.parsearJson(json);

        System.out.println(moneda);

        // Mostrar datos
        System.out.println("Código de la moneda: " + moneda.getCodigo());
        System.out.println("Tasas de cambio: " + moneda.getTasaCambio());



        /*try {
            String respuesta = apiCliente.realizarSolicitud("USD");
            System.out.println(respuesta);
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al realizar la solicitud: " + e.getMessage());
        }*/


    }
}