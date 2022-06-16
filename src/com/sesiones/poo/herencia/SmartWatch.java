package com.sesiones.poo.herencia;

import com.sesiones.poo.clases.SmartDevices;

public class SmartWatch extends SmartDevices {
    String color;
    boolean isWaterResist;

    public SmartWatch() {}

    public SmartWatch(String color, boolean isWaterResist) {
        this.color = color; this.isWaterResist = isWaterResist;
    }

    public SmartWatch(String model, int year, String BatteryType, String color, boolean isWaterResist) {
        super(model, year, BatteryType);
        this.color = color;
        this.isWaterResist = isWaterResist;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "color='" + color + '\'' +
                ", isWaterResist=" + isWaterResist +
                '}';
    }
}
