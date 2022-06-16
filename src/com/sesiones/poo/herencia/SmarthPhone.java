package com.sesiones.poo.herencia;

import com.sesiones.poo.clases.SmartDevices;

public class SmarthPhone extends SmartDevices {
    String lineType;
    String camara;
    String ram;

    public SmarthPhone() {}


    public SmarthPhone(String lineType, String camara, String ram) {
        this.lineType = lineType;
        this.camara = camara;
        this.ram = ram;
    }

    public SmarthPhone(String model, int year, String BatteryType, String lineType, String camara, String ram) {
        super(model, year, BatteryType);
        this.lineType = lineType;
        this.camara = camara;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "SmarthPhone{" +
                "lineType='" + lineType + '\'' +
                ", camara='" + camara + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
