package com.modul_advance_java.moduliGradivo.modul2.tokovi.builder;

import java.util.stream.Stream;

public class JavaProgram4 {
    static void main(String[] args) {
        //kreiranje toka na osnovu staticke metode Stream.builder
        //dodavanje elemenata se radi metodom add() i ona vraca builder objekat
        //vracanje builder objekta omogucava lancano pozivanje add meteode
        Stream<String> carStream = Stream.<String>builder().
                add("Honda").
                add("Toyota").
                add("Subaru").
                build();

    }
}
