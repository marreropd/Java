package com.sesiones;

public class sesion1 {
    public static void main(String[] args) {
        abstract class primera {

            int x;

            public primera() {

                x = 8;

            }

            public abstract void imprimir();

        }

        class segunda extends primera {

            public void imprimir() {

                x = 10;

            }

            public void incrementar() {

                x++;

            }

        }



    }
}
