package com.modul_advance_java.moduliGradivo.modul2.tokovi.medjuOperacije.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaProgram8 {
    static void main(String[] args) {
        //kreiramo list tako sto od unetih elemenata je napravimo i popunimo
        List<Integer> numbers = Arrays.asList(1, -2, 0, 22, 98, -434, -89, -66, 123, -222, -434);
        //kreiramo tok
        Stream<Integer> numbersStream = numbers.stream();
        //medju operacijom filter preradimo tj  selektujemo elemente u toku
        //reyultat filter je novi tok
        //collect j terminalna metoda koja za argument prima colector objekat
        //toCollection je metoda koja tok pretvara opet u kolekciju
        //arrays:: new je referenca na metodu konstruktora klase arrays
        ArrayList<Integer> numbersFiltrated = numbersStream.
                filter(value -> (value > 0)).collect(Collectors.toCollection(ArrayList::new));
        //originalna lista
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

        System.out.print("\n");
        //izmenjena lista
        for (Integer num : numbersFiltrated) {
            System.out.print(num + " ");
        }


    }
}
