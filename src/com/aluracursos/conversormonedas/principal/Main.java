package com.aluracursos.conversormonedas.principal;

import com.aluracursos.conversormonedas.ui.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputTeclado = new Scanner(System.in);
        int opcionInicial = 0;

        try {
            Menu menu = new Menu(inputTeclado, opcionInicial);
            menu.elegirOpcion();
        } finally {
            inputTeclado.close();
        }
    }
}
