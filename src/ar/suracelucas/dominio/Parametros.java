package ar.suracelucas.dominio;

import java.util.Scanner;

/* 
    2- Hacer un programa que recibe 4 parámetros, comprobar si son números, 
    y si son números, decir cuales son palíndromas (capicúa), e imprimirlos de menor a mayor. 
*/
public class Parametros {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "Programa que recibe 4 parametros, comprueba si son numeros, y si son numeros, dice cuales son palindromas, y los imprime de menor a mayor.");
        String cadenas[] = new String[4];
        String cadenasCapicuas[] = new String[4];
        Integer numerosPalindromos[] = new Integer[4];
        int j = 0;
        int x = 0;
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println("Ingrese una cadena: ");
            cadenas[i] = teclado.next();
            if (cadenas[i].equalsIgnoreCase(revertirString(cadenas[i]))) {
                cadenasCapicuas[j] = cadenas[i];
                j++;
            }
        }

        for (int i = 0; i < j; i++) {
            if (verificarQueSeaNumero(cadenasCapicuas[i])) {
                numerosPalindromos[x] = Integer.parseInt(cadenasCapicuas[i]);
                x++;
            }
        }

        for (int i = 1; i <= x; i++) {
            for (j = 0; j < x - 1; j++) {
                if (numerosPalindromos[j] > numerosPalindromos[j + 1]) {
                    int aux = numerosPalindromos[j];
                    numerosPalindromos[j] = numerosPalindromos[j + 1];
                    numerosPalindromos[j + 1] = aux;
                }
            }
        }

        System.out.println("\nNumeros palindromos ordenados de menor a mayor: ");
        for (int i = 0; i < x; i++) {
            System.out.println(numerosPalindromos[i]);
        }
    }

    private static String revertirString(String cadena) {
        char cadenaChar[] = cadena.toCharArray();
        cadena = "";
        for (int i = cadenaChar.length - 1; i >= 0; i--) {
            cadena += cadenaChar[i];
        }
        return cadena;
    }

    private static boolean verificarQueSeaNumero(String verificar) {
        int contarNumeros = 0;
        for (int i = 0; i < verificar.length(); i++) {
            int caracter = verificar.charAt(i);
            if (caracter >= 48 && caracter <= 57) {
                contarNumeros++;
            }
        }
        return (contarNumeros == verificar.length());
    }
}
