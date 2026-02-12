package com.modul_advance_java.moduliGradivo.modul2.kolekcije.niz;

import java.util.Arrays;

public class JavaProgram {
    //kreiran je niz tipa String sa unapred poznatim vrednostima
    //ovaj niz nema dinamicku strukturu
    //to je mana jer ne moze se menjati velicina
    //stase desi kada dodamo element u niz  kobojagi prosirimo
    // u pozadini se kreira novi nixz koji je duzi za 1 element
    static String[] carBrands = {"Honda", "Toyota", "Subaru", "Acura", "Lexus"};

    static void main(String[] args) {
        //koristimo toString metodu iz klase arrays kako bi prikazali sve elemente niza
        System.out.println(Arrays.toString(carBrands));
        //poziv je ovakav jer je metoda add klasni element tj pripada klasi a ne objektu klase
        //klasne elemente prepoznajemo po reci static to znaci da je ona staticki element
        addNewBrand("Nissan");
        System.out.println(Arrays.toString(carBrands));

    }

    //demonstracija dodavanja elemnta u niz
    //kopiramo niz i prosirujemo ga
    //objasnjenje detaljno u lekciji observer
    //preko starog niza ce se prepisati novi niz
    public static void addNewBrand(String brand) {
        String[] newCarBrands = new String[carBrands.length + 1];
        System.arraycopy(carBrands, 0, newCarBrands, 0, carBrands.length);
        newCarBrands[carBrands.length] = brand;
        carBrands = newCarBrands;
    }
}
