package ar.suracelucas.dominio;

import java.util.Scanner;

/*
    3- Hacer un programa que reciba N números, sumar por un lado los pares y por otro los impares.
    Decir si el promedio de pares o impares es mayor.
 */

public class SumaDeNumerosParesEImpares {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "Programa que recibe N numeros, suma por un lado los pares y por el otro los impares. Luego dice cual de los promedios es el mayor.");
        int cantidadNumerosPares = 0;
        int sumaPares = 0;
        int cantidadNumerosImpares = 0;
        int sumaImpares = 0;
        int numero;
        do {
            System.out.println("Ingrese un numero. Ingrese 0 para terminar las sumas: ");
            numero = ingresarOpcion();

            if (numero == 0 && cantidadNumerosPares == 0 && cantidadNumerosImpares == 0) {
                return;
            }
            if (numero % 2 == 0) {
                sumaPares += numero;
                cantidadNumerosPares++;
            } else {
                sumaImpares += numero;
                cantidadNumerosImpares++;
            }

        } while (numero != 0);

        double promPar = sumaPares / cantidadNumerosPares;
        double promImpar = sumaImpares / cantidadNumerosImpares;
        System.out.println("\nSuma de los numeros pares: " + sumaPares);
        System.out.println("Suma de los numeros impares: " + sumaImpares);
        System.out.println("Promedio de sumas pares: " + promPar);
        System.out.println("Promedio de sumas impares: " + promImpar);
        if (promPar > promImpar) {
            System.out
                    .println("El promedio de sumas de numeros pares es mayor al promedio de sumas de numeros impares.");
        } else if (promImpar > promPar) {
            System.out
                    .println("El promedio de sumas de numeros impares es mayor al promedio de sumas de numeros pares.");
        } else {
            System.out.println("La suma de los promedios son iguales.");
        }
    }

    private static int ingresarOpcion() {
        return teclado.nextInt();
    }
}
