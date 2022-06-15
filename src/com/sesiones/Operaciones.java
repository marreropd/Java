package com.sesiones;

public class Operaciones {
    public static void main(String[] args) {
        float result =  OperacionIva(100);
    }

    static float OperacionIva(int num){
        System.out.println(num * 0.22 + num);
        return (float) (num * 0.22 + num);

    }
}
