package ar.suracelucas.dominio;

import java.util.Scanner;

/*
    1- Hacer un programa que reciba 3 números, imprimir por pantalla cual es el más grande, 
    el del medio y el más chico.
*/

class Numeros {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Programa que recibe 3 numeros, los ordena e imprime por pantalla el mas grande, el del medio y el mas chico.");
        int numeros[] = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero:");
            numeros[i] = ingresarOpcion();
        }

        for (int i = 1; i <= numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        System.out.println("\nSalida:\nMas grande: " + numeros[0] +".\nMedio: " + numeros[1] + ".\nMas chico: " + numeros[2] + ".");
    }

    private static int ingresarOpcion() {
        return teclado.nextInt();
    }
}
