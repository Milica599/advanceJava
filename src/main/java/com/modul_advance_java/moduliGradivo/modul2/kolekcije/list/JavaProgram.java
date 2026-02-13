package com.modul_advance_java.moduliGradivo.modul2.kolekcije.list;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaProgram {
    static void main(String[] args) {
        //arraylist je najslicniji nizu\
        //arraylist ima dinamicku strukturu
        //moze mu se menjati velicina
        //imaju indeksiran pristup isto kao sto su to imali i nizovi
        ArrayList myList = new ArrayList();

        //metodom add() dodajemo elemente u listu
        //pri dodavanju elementi se smestaju redom
        //lepe se na krAaj niza
        //moze da dodajemo objekte razlicitog tipa  jer se svaki od njih predstavlja kao Object
        //Object je bazni tip koji nasledjuju svi drugi tipovi
        //mesanje tipova u kolekciji je moguce dok se ne izvrsi parametrizacija kolekcije
        //svaka kolekcija je generickog tipa
        //genericno- nije unapred poznat tip
        myList.add("Honda");
        myList.add(13);
        myList.add("Toyota");

        //metodom set ubacujemo element na tacno odredjenu poziciju
        //ovde smo element mazda ubacili na 2 poziciju
        myList.set(1, "Mazda");
        //ispis elementa na 2 poziciji
        //dobicemo mazda jer smo umetnuli mazda
        //System.out.println(myList.get(1));
        //uklanjamo element na tom indeksu
        myList.remove(1);
        //ispis liste
        //System.out.println(myList);

        //ispisuje se svaki element liste 1. nacin
        //ovde se krecemo po indeksima tj po pozicijama
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        //ispisuje se svaki element liste 2.nacin
        //ovde se krecemo po elementima liste
        for (Object s : myList) {
            System.out.println(s);

        }

        //prolazak kroz kolekciju se moze obavii pomocu objekta tipa Iterator
        //svaka vrsta kolekcije nasledju svoju abstractnu verziju
        //pa ta abstraktna verzija nasledjuje klasu koja predstavlja sve kolekcije
        //a ta klasa Collection(sve klase ) nasledjuje interfejs Iterable
        //a iterable je funkcionalni interface koji ima metodu cije je rezultat objekat tipa iterator
        // a iterator je interfejs
        //pomocu metoda iz Iterator mozemo da :
        //public boolean hasNext() – vraća vrednost true ukoliko postoji naredni element; u protivnom vraća vrednost false;
        //public Object next() – vraća referencu na trenutni element i pomera kursor za jedno mesto unapred, na sledeći element;
        //public void remove() – uklanja element sa pozicije na kojoj se kursor trenutno nalazi.
        //upotreba iterator objekta  za ispis elemenata liste
        //3.nacin za ispis elemenata
        Iterator itr = myList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //u uslovu pomocu metode constaint() proveravamo da li postoji element sa tom vrednoscu
        if (myList.contains("Honda")) {
            //metodom indexOf() trazimo index elementa koji je zadat
            int elemIndex = myList.indexOf("Honda");
            //citamo vrednost elementa metodom get(index od honda)
            String elem = (String) myList.get(elemIndex);
            //ispisujemo element
            //u pozadini toString
            System.out.println(elem);
        }

        //kreiramo niz tipa Object koji nastaje pretvaranjem liste u niz - toArray
        //tip je Object jer su u listi razliciti tipovi elemenata trenutno
        //niz i lista ce biti u ovom trenutku jednake duzine
        Object[] array = myList.toArray();
        //ispisacemo svaki element iz liste koji je u nizu
        //tj ispis svih elemenata niza
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //brisemo sve elemente liste
        //lista je prazna
        myList.clear();
    }
}

