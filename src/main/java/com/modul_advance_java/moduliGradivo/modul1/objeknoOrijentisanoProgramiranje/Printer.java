package com.modul_advance_java.moduliGradivo.modul1.objeknoOrijentisanoProgramiranje;
//polimorfizam kreiranjem klasa koje nasledjuju roditeljsku klasu kreiramo verziju -polimorfizam
public class Printer extends Product {
    boolean color;

    //overload -polimorfizam- isto ime razliciti parametri po broju ili tipu ili oba
    public Printer(String brand, String model, double price, boolean color) {
        super(brand, model, price);
        this.color = color;
    }

    //polimorfizam metode
    //override isto ime metode isti parametri
    // napomena super je poziv za sve iz klase koje nasledjujemo
    // roditeljski toString je nasledjen i na njega dodajemo izmenu
    // super.toString je poziv za toString iz Product

    @Override
    public String toString() {
        return super.toString() + ", " + "color=" + color;
    }

    @Override
    public int checkStock() {
        return 0;
    }
}






