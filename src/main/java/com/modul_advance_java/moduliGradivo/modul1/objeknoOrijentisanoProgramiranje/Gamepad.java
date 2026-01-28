package com.modul_advance_java.moduliGradivo.modul1.objeknoOrijentisanoProgramiranje;

// nasledjivanje formula extends ime klase koju nasledjujemo
//posle extends moye da ide sao ime jedne klase - razlog moye se naslediti samo jedna klasa

import com.modul_advance_java.moduliGradivo.modul1.apstraktneKlaseIInterfejsi.Searchable;
import com.modul_advance_java.moduliGradivo.modul1.apstraktneKlaseIInterfejsi.Storable;
//klasu nasledjujemo,interfejs implementiramo
//extends jednu klasu ,implements moze vise interface
public class Gamepad extends Product implements Storable, Searchable {
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

    //podrazumevana implementacija
    @Override
    public int checkStock() {
        return 0;
    }

    //generisane zbog implementacije programer pise logiku metoda iz interface
    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
}