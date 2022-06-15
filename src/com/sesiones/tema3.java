package com.sesiones;

public class tema3 {
    /**
     * En este ejercicio tenéis que crear un bucle que permita concatenar textos
     * e imprima el resultado final por consola.
     * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
     * String[] nombres = {"", "", "", ""}
     * @param args
     */
    public static void main(String[] args) {

        String[] nombres = {"Martina", "Juan", "Pedro", "Jhoana"};

        for(String nombre : nombres){
            System.out.print(nombre + " ");
        }
    }
}
