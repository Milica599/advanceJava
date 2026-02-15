package com.modul_advance_java.moduliGradivo.modul2.tokovi.nizItok;

import java.util.Arrays;
import java.util.stream.Stream;

public class JavaProgram1 {
    static void main(String[] args) {
        String[] cars = {"Honda", "Toyota", "Subaru"};
        //pretvaranje niza u tok
        Stream<String> carsStreamm = Arrays.stream(cars);

    }
}
