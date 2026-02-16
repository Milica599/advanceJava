package com.modul_advance_java.moduliGradivo.modul3.napredniRadSaTekstom.regexEmail;

import java.util.regex.Pattern;

//prakticno kao vezba za regex
public class JavaProgram {
    static void main(String[] args) {
        String email1 = "some.email@gmail.com";
        String email2 = "some.email@gmail";
        String email3 = "some.email.gmail.com";
        String email4 = "some.email.gmail.comcom";

        String regex = "[A-Za-z0-9+.]+@[A-Za-z0-9+.]+\\.[A-Za-z]{2,4}";

        boolean valid1 = Pattern.matches(regex, email1);
        boolean valid2 = Pattern.matches(regex, email2);
        boolean valid3 = Pattern.matches(regex, email3);
        boolean valid4 = Pattern.matches(regex, email4);

        System.out.println(email1 + ": " + valid1);
        System.out.println(email2 + ": " + valid2);
        System.out.println(email3 + ": " + valid3);
        System.out.println(email4 + ": " + valid4);
    }
}
