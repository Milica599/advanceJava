package com.modul_advance_java.moduliGradivo.modul2.tokovi.generateAndIterate;

import java.util.stream.Stream;

public class JavaProgram5 {
    static void main(String[] args) {
        //kreiranje toka na osnovu generate
        //generate se ponasa kao petlja koja se izvrsava sve do svog limita
        //bez limit bi bilo beskonacno iteriranje
        //osam puta elem je rezultat
        Stream<String> streamGenerated = Stream.generate(() -> "elem").
                limit(8);
        //kreiranje na osnovu iterate metode
        //iterate se ponasa kao for petlja
        //iterate se takodje zaustavlja metodom limit
        Stream<Integer> streamiterated = Stream.iterate(0, n -> n + 1).
                limit(13);

    }
}
