package com.modul_advance_java.moduliGradivo.modul2.tokovi.liste;

import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaProgram2 {
    static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Subaru");
        //kreiranje toka na osnovu kolekcije
        Stream<String> carsStreami = cars.stream();
    }
}
