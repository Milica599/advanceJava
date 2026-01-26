package com.modul_advance_java.modul1.objeknoOrijentisanoProgramiranje;

import com.modul_advance_java.modul1.apstraktneKlaseIInterfejsi.Storable;

//kreiranje ove klase - apstrakcija
// nasledjivanje - nasledili smo klasu Object tad ne koristimo extands jer se ovo nasledjivanje podrazumeva
// da smo nasledili neku drugu klasu bilo bi u nastavku extends pa ime klase koja je nasledjena
public abstract class Product  {

    //definisanje polja u klasi
    //modifikatori vidljivosti - enkapsulacija polja - posledica get i set metode

    private String brand;
    private String model;
    private double price;
    private Object System;

    //kreiranje get i set metoda
    //get citanje vrednosti polja
    //set postavljanje vrednosti polja
    //svako polje ima svoju get i set metodu
    //this pokazuje na polje
    //this se moze koristiti samo u klasi gde je polje kreirano

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //ova metoda je konstruktor - sluzi za kreiranje objekta
    //konstruktor ima uvek isti naziv kao i klasa

    public Product(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //redefinisana toString metoda
    // \n je oznaka za novi red na windowsu,\r\n je oznaka za novi red na Linuksu
    // najbolje koristiti metodu line separatotor System.lineseparator()
    //umesto \n moze System.lineseparaor()

    @Override
    public String toString() {
        return "brand='" + brand + "\n" +
                "model='" + model + "\n" +
                "price=" + price ;
    }

    //apstraktna metoda
    public abstract int checkStock();
}
