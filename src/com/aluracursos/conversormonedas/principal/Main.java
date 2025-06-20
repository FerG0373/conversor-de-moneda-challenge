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

        // Mostrar datos
        System.out.println("Moneda base: " + moneda.getCodigo());
        System.out.println("Podés convertir a: " + moneda.getTasaCambio());
    }
}