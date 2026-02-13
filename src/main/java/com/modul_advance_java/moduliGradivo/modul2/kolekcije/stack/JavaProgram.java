package com.modul_advance_java.moduliGradivo.modul2.kolekcije.stack;

import java.util.Stack;

public class JavaProgram {
    static void main(String[] args) {
        //stack je vrsta kolekcije
        //stak je lifo - last in firs out citanje elementata
        Stack mystack = new Stack();

        //metodom push() dodajemo elemente u stack
        mystack.push("Honda");
        mystack.push("Toyota");
        mystack.push("Mazda");
        mystack.push("Subaru");

        //pop() metoda cita i uklanja element iz stack
        //to ce biti subaru element kao rezultat pop
        //razlog subaru je poslednji upisan ali se prvi cita
        //pop() je dokaz za lifo
        System.out.println(mystack.pop());
        //mazda je rezultat
        System.out.println(mystack.pop());
        //ispisujemo velicinu kolekcije
        //size za stack je isto sto i length za niz
        System.out.println(mystack.size());
    }
}
