package com.gorka;


/**
 * Ejercicio 3:
 *En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 *
 * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
 *
 * String[] nombres = {"", "", "", ""}
 * @author Gorka Chardon
 * @version 31/01/2023
 */
public class MainBucle {

    public static void main(String[] args) {
        //Creo el array con los nombres
        String[] nombres = {"Gorka", "Paco", "Ana", "Juana", "Pepe", "Adrián", "Markel"};
        //creo la cadena de texto donde voy a almacenarlos para concatenarlos
        String cadena = "";
        for (String nom: nombres) {
            //concateno los nombres dentro del String "Cadena"
            cadena += nom + " ";
        }
        //Imprimo el String en pantalla
        System.out.println("Los nombres concatenados son: " + cadena + ".");

    }
}
