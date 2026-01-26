package com.modul_advance_java.modul1.objeknoOrijentisanoProgramiranje;

public class JavaProgram {
   public static void main(String[] args) {

       //kreiranje objekta - instanciranje klase Product
       //formula za kreiranje objekta: tip objekta ime objekta = new konstruktor;
       //enkapsulacija objekta - ima sve informacije zajedno kao jednu celinu

       Product product1 = new Product("Logitech", "F710", 129.99);
       Product product2 = new Product("HP", "Envy Photo 7155", 179.99);
       Product product3 = new Product("Dell", "U2419H", 219.99);

       // naredba za ispis objekta println,print
       //u pozadini se poziva toString  za product1
       //bolje je koristiti sa toString


       System.out.println(product1);
       System.out.println(product2.toString());
       System.out.println(product3.toString());


    }
}
