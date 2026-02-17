package com.modul_advance_java.moduliGradivo.modul4.ulaznoIzlazniTokovi.konzola;

import java.util.Scanner;

public class JavaProgram {
    static void main(String[] args) {
        //koristen je tok PrintStream
        //tok PrintStream u sebi ima metode print i println
        //kao i staticko polje out an osnovu kog imamo pristup objektu
        System.out.println("This is text.");

        //print vs println
        System.out.print("This is text.");
        System.out.print("This is text.");
        System.out.println("This is text.");
        System.out.println("This is text.");
        /*
        //los nacin
        //System.out.println("Enter something here: ");
        //operisemo ulaznim tokom a ne fajlom
        //system.in je ulazni tok
        try (BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in))) {
           //cita sta je korisnik uneo u konzolu
            //readLine blokira izvrsavanje dok korisnik ne unese nesto
            String s = bufferRead.readLine();
            //ispis onoga sto je uneo
            System.out.println("You entered: " + s);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

        //udobniji nacin i bolji
        System.out.println("Enter something here: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("You entered: " + s);

        //ako znamo da citamo int podatke
        System.out.print("Enter a number: ");
        scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            System.out.println(number);
        } else
            System.out.println("You must enter a number!");
    }
}
