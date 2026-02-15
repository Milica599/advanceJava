package com.modul_advance_java.moduliGradivo.modul2.tokovi.redukcija;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaProgram12 {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -2, 0, 22, 98, -434, -89, -66, 123, -222, -434);
        Stream<Integer> numbersStream = numbers.stream();

        //redukcija svodjenje toka na jedan element
        //identity predefinisana vrednost redukcije ili finalna vrednost ako je tok prazan drugacije se naziva i pocetna vrednost
        //subtotal tu sabiramo elemente iz toka tj akumulacioni element
        // element je element toka  tj prvi broj , drugi broj....
        //reduce sa lambda reduce(0,(subtotal,element) -> subtotal+element)
        //napise mo pomocu lambde jer je tako logicnije za nas pocetnike i onda kliknemo zameni sa referencom na metodu
        //ovo je sa referencom na metodu reduce(0,integer:: sum)
        Number reduced = numbersStream.reduce(0, Integer::sum);
        //ispis redukovanog toka
        System.out.println(reduced);
    }
}
