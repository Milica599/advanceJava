package com.modul_advance_java.moduliGradivo.modul2.tokovi.medjuOperacije.pipeLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaProgram11 {
    static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, -2, 0, 22, 98, -434, -89, -66, 123, -222, -434);
        Stream<Integer> numbersStream = numbers.stream();

        //pipeline se odnosi na to da je medju operacije moguce nadovezivati
        //jer svaka medju operacija kreira novi tok
        //pa sledeca medju operacija ne radi nad originalnim tokom
        // nego na onim tokom koji je kao rezultat vratila prethodna medju operacija
        ArrayList<Integer> numbersPipeline = numbersStream.filter(num -> num > 0).
                distinct().
                sorted().
                collect(Collectors.toCollection(ArrayList::new));

        //originalna lista
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

        System.out.print("\n");
        //izmenjena lista
        for (Integer num : numbersPipeline) {
            System.out.print(num + " ");
        }

    }
}
