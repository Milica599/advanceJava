package com.modul_advance_java.moduliGradivo.modul2.kolekcije.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class JavaProgram {
    static void main(String[] args) {
        //HashSet kolekcija je kolekcija prema kojoj se odnosimo kao prema pojmu skupa
        //nema poseban redosled ubacivanja
        //ima sopstveni nacin za sortiranje
        //duplikati nisu dozvoljeni  ali program ne puca ako unesemo dvaista elementa
        //ako dva elementa imaju istu vrednost preko elementa starog se ispise vrednost novog elementa
        //nova vrednost se prepise preko stare
        HashSet myCollection = new HashSet();
        //metodom add() dodajemo elemente u hashSet
        //kad se svi elementi dodaju u HashSet
        //ne znaci da ce tim redosledom biti i smestei u kolekciju
        myCollection.add("One");
        myCollection.add("Two");
        myCollection.add("Three");
        myCollection.add("Four");
        myCollection.add("Five");
        myCollection("One");

        //ispis svih elemenata hashSet-a
        //ujedno i dokaz za nepostojanje redosleda
        //dokaz dase  da se elementi ne smestaju redom kojim smo ih unosili
        //prolazak kroz petlju pomocu iteratora funkcionise na isti nacin kao sto smo ranije prikazali
        Iterator<String> i = myCollection.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
