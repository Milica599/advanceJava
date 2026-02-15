package com.modul_advance_java.moduliGradivo.modul2.tokovi.mapa;

import java.util.HashMap;
import java.util.stream.Stream;

public class JavaProgram3 {
    static void main(String[] args) {
        //slucaj sa mapama je specijalan jer nam trebaju dva toka podataka
        //tok za kljuceve i tok za vrednost
        HashMap<Integer, String> car = new HashMap<>();
        car.put(1, "Honda");
        car.put(2, "Toyota");
        car.put(3, "Subaru");
        //kreiranje toka vrednosti
        Stream<String> carBrandsStream = car.values().stream();
        //kreiranje toka kljuceva
        Stream<Integer> carKeysStream = car.keySet().stream();
    }
}
