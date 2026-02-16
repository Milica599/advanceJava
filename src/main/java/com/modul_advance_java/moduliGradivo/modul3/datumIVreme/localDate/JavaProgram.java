package com.modul_advance_java.moduliGradivo.modul3.datumIVreme.localDate;

import java.time.LocalDate;

//svi ovi tipovi se nalaze u paketu time
public class JavaProgram {
    static void main(String[] args) {
        //LocalDate je klasa za rad sa datumom
        //LocalDate klasa datum formatira godina- mesec-dan
        //metodom now() dobijamo trenutni datum tj danasnji dan
        System.out.println(LocalDate.now());

        //kreiranje objekta tipa LocalDate
        LocalDate now = LocalDate.now();
        //getYear() je metoda koja nam vraca trenutnu godinu zato sto smo objektu now dodelili sadasnji datum
        //inace getyear() metoda vraca deo koji se odnosi na godinu
        //LocalDate objekat u sebi ima godinu year mesec month i dan day
        // pa imamo i get metode za svaki od tih polja
        System.out.println(now.getYear());

        //of() je staticka metoda koja ce od brojeva u zagradi napraviti datum
        //rezultat staticke metode of() je datum 2021-11-20
        // rezultat od of() metode je LocalDate objekat
        LocalDate date = LocalDate.of(2021, 11, 20);

    }
}
