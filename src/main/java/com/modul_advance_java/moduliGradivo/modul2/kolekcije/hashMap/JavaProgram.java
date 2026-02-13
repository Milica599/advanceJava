package com.modul_advance_java.moduliGradivo.modul2.kolekcije.hashMap;

import java.util.HashMap;

public class JavaProgram {
    static void main(String[] args) {
        //mape su specijalni oblik kolekcije jer su to kolekcije parova
        //par se sastoji od kljuca i vrednosti
        //ovde kljuc sluzi za identifikaciju elementa
        //kljuc jedinstveno identifikuje vrednost
        HashMap hashMap = new HashMap();

        //metodom put() stavljamo par u mapu
        //prvi je kljuc a druga je vrednost koja ide uz taj kljuc
        //kljucevi moraju biti jedinstveni tj svi kljucevi su razliciti
        //vrednosti se mogu ponavljati
        //ako je kljuc isti  ali je vrednost razlicita prikazace se za taj kljuc poslednja dodatavrednost
        hashMap.put("1234567890123", "John Davidson");
        hashMap.put("1234567890124", "Tom Dvorak");

        //get() je metoda koja cita vrednost pod tim kljucem
        //rezultat je tom dvorak
        System.out.println(hashMap.get("1234567890124"));
    }
}
