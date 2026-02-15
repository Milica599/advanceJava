package com.modul_advance_java.moduliGradivo.modul2.tokovi.prostiTip;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JavaProgram6 {
    static void main(String[] args) {
        //kreiranje toka prostih tipova - poseban tip toka
        //Stream se ne moze parametrizovati prostim tipom
        //za int je IntStream - tok prostog tipa int
        //postoje jos LongSTream za brojeve koji opsegom ne stanu u int
        //postoji i DoubleStream za tok decimalnih brojeva
        int[] numbers = {1, -2, 0, 22, 98, -434, -89, -66, 123};
        IntStream numbersStream = Arrays.stream(numbers);

    }
}
