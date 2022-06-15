package com.sesiones;

public class Operaciones {
    public static void main(String[] args) {
        float result =  Operacion(100);
    }

    static float Operacion(int num){
        System.out.println(num * 0.22);
        return (float) (num * 0.22);

    }
}
