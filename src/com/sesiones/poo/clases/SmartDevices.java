package com.sesiones.poo.clases;

public class SmartDevices {
    String model;
    int year;
    String BatteryType;

    public  SmartDevices() {}

    public SmartDevices(String model, int year, String BatteryType) {
        this.model = model;
        this.year = year;
        this.BatteryType = BatteryType;
    }

    @Override
    public String toString() {
        return "SmartDevices{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", BatteryType='" + BatteryType + '\'' +
                '}';
    }
}
