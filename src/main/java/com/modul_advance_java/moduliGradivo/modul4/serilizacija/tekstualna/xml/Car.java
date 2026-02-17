package com.modul_advance_java.moduliGradivo.modul4.serilizacija.tekstualna.xml;

//serilizacija xml -tekstualna uslovi
//1.polja su prvivatna
//2.get i set metode
//nije neophodan serializable
public class Car {
    private int id;
    private String model;
    private double maximumSpeed;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaximumSpeed() {
        return this.maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public String toString() {
        return this.id + " " + this.model + " " + this.maximumSpeed;
    }

}
