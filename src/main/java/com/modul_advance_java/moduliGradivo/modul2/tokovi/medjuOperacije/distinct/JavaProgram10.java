package com.modul_advance_java.moduliGradivo.modul2.tokovi.medjuOperacije.distinct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaProgram10 {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -2, 0, 22, 98, -434, -89, -66, 123, -222, -434);
        Stream<Integer> numbersStream = numbers.stream();
        //uklanjanje duplikata iz toka distinct()
        //distinct je medju operacija
        ArrayList<Integer> numbersDisctinct = numbersStream.distinct().
                collect(Collectors.toCollection(ArrayList::new));
        //originalna lista
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

        System.out.print("\n");
        //izmenjena lista
        for (Integer num : numbersDisctinct) {
            System.out.print(num + " ");
        }

    }
}
