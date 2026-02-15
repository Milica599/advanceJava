package com.modul_advance_java.moduliGradivo.modul2.tokovi;

import java.util.Arrays;
import java.util.stream.Stream;

//Stream je genericki interfejs koji se parametrizuje
//Stream kao ni jedan drugi genericni tip se ne moze parametrizovati prostim tipom
//rad sa tokom ide preko dve vrste operacija - medju operacije i terinalne operacije

public class JavaProgram {
    static void main(String[] args) {
        //nas prvi susret sa tokovima je kroz lambdu
        int[] numbers = {13, 8, -9, 15, -1, -78, 5, 69};
        //pravimo od niza numbers tok
        numbers = Arrays.stream(numbers).
                filter(value -> (value > 0))
                .toArray();
        System.out.println(Arrays.toString(numbers));

        //kreiranje paznog toka se rady sa empty()
        Stream<String> emptyStream = Stream.empty();
    }
}
