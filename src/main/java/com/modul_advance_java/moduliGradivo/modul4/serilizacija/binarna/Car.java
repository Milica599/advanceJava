package com.modul_advance_java.moduliGradivo.modul4.serilizacija.binarna;


import java.io.Serializable;

public class Car implements Serializable {
    public int id;
    public String model;
    public double maximumSpeed;

    @Override
    public String toString() {
        return this.id + " " + this.model + " " + this.maximumSpeed;
    }
}
