package com.modul_advance_java.moduliGradivo.modul2.tokovi.medjuOperacije.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaProgram9 {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -2, 0, 22, 98, -434, -89, -66, 123, -222, -434);
        Stream<Integer> numbersStream = numbers.stream();
        //sorted metoda je za sortiranje elemenata
        //ako sorted prosledimo Comparator.reserveOrder od vecih ka manjem
        //sorted() od manjih ka vecem
        //sorted je medju operacija
        ArrayList<Integer> numbersSorted = numbersStream.sorted().
                collect(Collectors.toCollection(ArrayList::new));

        //originalna lista
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

        System.out.print("\n");
        //izmenjena lista
        for (Integer num : numbersSorted) {
            System.out.print(num + " ");
        }

    }
}
