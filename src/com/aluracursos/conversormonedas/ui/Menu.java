package com.aluracursos.conversormonedas.ui;

import java.util.Scanner;

public class Menu {
    private Scanner teclado;
    private int opcion;

    public Menu(Scanner teclado, int opcion) {
        this.teclado = teclado;
        this.opcion = opcion;
    }

    public void mostrarMenu() {
        System.out.println("""
            \n*** ¡Bienvenido(a) a su Conversor de Monedas! ***
            
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
}
