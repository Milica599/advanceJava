package com.modul_advance_java.moduliGradivo.modul2.generickitipoviPodataka;

//najblize moguce tj najopstije sto mozemo bez upotrebe generickog tipa
// je da napravimo klasu koja ima polje tipa Object
// bolja opcija je uvodjenje generickog tipa
//kako sintaksno prepoznati da je ovo geerican Tip?
//tako sto imamo parametrizaciju klase MyClass tipom T
//taj tip T je neodredjen Tip tj generican deo klase
//T - je tip kojim cemo parametrizovati npr u JavaProgram smo parametrizovali pomocu String
//parametrizacija se moze izvesti bilo kojim slozenim tipom podatke ili omotacem prostih tipova
//omotac prostog tipa je isto slozen tip ali da naglasimo sta se tad radi
//klasa moze biti parametrizovana sa jednim ili vise parametara
//ako je sa vise samo ih razdvojimo  sa zarezom ,

//kada parametrizujemo sa vise parametara ovo su neke od uobicajenih naziva ali  ih ne moramo postovati
//E – element;
//K – ključ;
//N – broj;
//T – tip;
//V – vrednost;
//S, U, V – drugi, treći i četvrti tip.

public class MyClass<T, S, U> {
    public T t;
    public S s;
    public U u;

    //konstruktor prihvata i genericke tipove
    // T,S,V ce biti neki konkretni tipovi
    public MyClass(T t, S s, U u) {
        this.t = t;
        this.s = s;
        this.u = u;
    }

    public MyClass() {
        this.t = t;
    }

    public MyClass(T t) {
        this.t = t;
    }
}
