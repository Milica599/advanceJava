package com.modul_advance_java.modul1.objeknoOrijentisanoProgramiranje;

// nasledjivanje formula extends ime klase koju nasledjujemo
//posle extends moye da ide sao ime jedne klase - razlog moye se naslediti samo jedna klasa

public class Gamepad extends Product {
    boolean wireless;

    //konstruktor se ne nasledjuje direktno
    //super naredba za poziv klase koju smo nasledili- roditeljski konstruktor

    public Gamepad(String brand, String model, double price, boolean wireless) {
        super(brand, model, price);
        this.wireless = wireless;
    }
    @Override
    public String toString() {
        return super.toString() + ", " + "wireless=" + wireless;
    }
}