package com.aluracursos.conversormonedas.ui;

import com.aluracursos.conversormonedas.services.ClienteConsultaApi;
import com.aluracursos.conversormonedas.services.ConvertidorMoneda;
import com.aluracursos.conversormonedas.services.ParserJsonMoneda;

import java.util.Scanner;

public class Menu {
    private Scanner teclado;
    private int opcion;
    private final ConvertidorMoneda convertidorDeMonedas;

    public Menu(Scanner teclado, int opcion) {
        this.teclado = teclado;
        this.opcion = opcion;
        // Instancia de dependencias necesarias.
        ClienteConsultaApi consulta = new ClienteConsultaApi();
        ParserJsonMoneda parser = new ParserJsonMoneda();
        this.convertidorDeMonedas = new ConvertidorMoneda(consulta, parser);
    }

    public void mostrarMenu() {
        System.out.print("""
            \n*** ¡Bienvenido(a) a su Conversor de Monedas! ***
            
            Seleccione la opción que desea:
            
            1) Dólar =>> Peso argentino.
            2) Peso argentino =>> Dólar.
            3) Dólar =>> Real brasileño.
            4) Real brasileño =>> Dólar.
            5) Dólar =>> Euro.
            6) Euro =>> Dólar.
            7) Salir.
            """);
        System.out.print(">> ");
    }

    public void elegirOpcion() {
        while(opcion != 7) {
            mostrarMenu();
            opcion = teclado.nextInt();

            switch(opcion) {
                case 1 -> procesaConversion("USD", "ARS");
                case 2 -> procesaConversion("ARS", "USD");
                case 3 -> procesaConversion("USD", "BRL");
                case 4 -> procesaConversion("BRL", "USD");
                case 5 -> procesaConversion("USD", "EUR");
                case 6 -> procesaConversion("EUR", "USD");
                case 7 -> System.out.println("¡Gracias por usar el conversor!");
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private void procesaConversion(String codigoOrigen, String codigoDestino) {
        System.out.print("Ingresar monto a convertir: ");
        double monto = teclado.nextDouble();

        try {
            double resultado = convertidorDeMonedas.convertirMoneda(codigoOrigen, codigoDestino, monto);
            System.out.printf("El resultado es: %.2f %s%n", resultado, codigoDestino);
        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

}
