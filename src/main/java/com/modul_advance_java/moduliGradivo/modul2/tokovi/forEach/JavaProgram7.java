package com.modul_advance_java.moduliGradivo.modul2.tokovi.forEach;

import java.util.Arrays;
import java.util.stream.Stream;

public class JavaProgram7 {
    static void main(String[] args) {
        String[] cars = {"Honda", "Toyota", "Subaru"};
        //kreiranje toka na osnovu niza tj kolekciju pretvaram u tok stream metodom
        Stream<String> carsStream = Arrays.stream(cars);
        //prolazak kroz tok koriscenjme forEach metode
        //forEach sustinsku logiku ima kao for petlja
        //System.out :: println je referenca na metodu
        // forEach je terminalna operacija i nije je moguce nad istim tokom pozvati vise puta
        //terminalna operacija kad se zavrsi onda se i tok zatvara
        //a terminalna ponovna operacije se ne moze izvrsiti nad tokom koji je vec zatvoren
        carsStream.forEach(System.out::println);

    }
}
