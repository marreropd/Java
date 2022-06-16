package com.sesiones.poo.clases;

import com.sesiones.poo.herencia.SmartWatch;
import com.sesiones.poo.herencia.SmarthPhone;

/**
 * En este ejercicio tendréis que crear una clase SmartDevice.
 * Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 *
 */
public class Main {
    public static void main(String[] args) {

        SmartDevices device1 = new SmartDevices("firstModel",2001,"batery456");

        SmarthPhone phone1 = new SmarthPhone("2022",2022,"batery456","4G","48 MGPX", "6GB");

        SmartWatch watch1 = new SmartWatch("watch264", 2021,"batery456","gray",true);

        System.out.println(device1);
        System.out.println(phone1);
        System.out.println(watch1);

    }
}
