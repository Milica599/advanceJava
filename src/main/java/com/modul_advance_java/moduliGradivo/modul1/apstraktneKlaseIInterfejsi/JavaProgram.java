package com.modul_advance_java.moduliGradivo.modul1.apstraktneKlaseIInterfejsi;

import com.modul_advance_java.moduliGradivo.modul1.objeknoOrijentisanoProgramiranje.Gamepad;
import com.modul_advance_java.moduliGradivo.modul1.objeknoOrijentisanoProgramiranje.Monitor;
import com.modul_advance_java.moduliGradivo.modul1.objeknoOrijentisanoProgramiranje.Printer;

public class JavaProgram {
    static void main(String[] args) {
        Gamepad product1 = new Gamepad("Logitech", "F710", 129.99,true);
        Printer product2 = new Printer("HP", "Envy Photo 7155", 179.99,true);
        Monitor product3 = new Monitor("Dell", "U2419H", 219.99,24);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        //interfejs je i tip podatka - princip nasledjivanja(implements)
        Storable product4 = new Gamepad("Logitech", "F710", 129.99,true);
        System.out.println(product4);
    }
}
