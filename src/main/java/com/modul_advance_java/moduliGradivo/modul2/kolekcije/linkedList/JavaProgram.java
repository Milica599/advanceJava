package com.modul_advance_java.moduliGradivo.modul2.kolekcije.linkedList;

import java.util.LinkedList;

public class JavaProgram {
    static void main() {
        //linked list je fifo
        //element koji se prvi upise se i cita prvi
        //indeksiran pristup
        //brza za dodavanje u sredinu
        LinkedList myList = new LinkedList();
        //metodom add() dodajemo elemente u kolekciju
        myList.add("Honda");
        myList.add("Toyota");
        myList.add("Mazda");
        myList.add("Subaru");

        //peek() - cita element ali ga ne uklanja radi kao get klasicni
        //rezultat Honda
        System.out.println(myList.peek());
        //dokaz da se broj elemenata nije promeni
        System.out.println(myList.size());
        //poll() - cita i uklanja element
        //rez Honda pool vrati element koji je uklonio
        System.out.println(myList.poll());
        //dokaz da je lista skracena
        System.out.println(myList.size());


    }
}
