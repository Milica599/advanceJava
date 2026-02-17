package com.modul_advance_java.moduliGradivo.modul4.serilizacija.binarna;

import java.io.*;

//unutar java programa podaci se predstavljaju objektima
//imperativ lako rukovanje podacima
//Kada se javi potreba da podaci predstavljeni objektima
//napuste izvorni Java program kako bi bili upisani u neko
//skladište ili prosleđeni nekom drugom programu preko mreže,
//najelegantnije rešenje se ogleda u njihovom konvertovanju u forme koju
// su posebno prilagođene čuvanjuili deljenju. Koncepti kojima se tako nešto realizuje
//nazivaju se serijalizacija i deserijalizacija
//serilizacija konvertovanje podataka u oblik pogodan za skladistenje ili deljenje
//binarna i tekstualna serilizacija
public class JavaProgram {
    static void main(String[] args) {
        //serilizacija obavljena celog objekta odjednom
        //ali da bi ovo bilo moguce mora klasa Car da implementira interfejs Seriaalizable
        try (FileOutputStream fos = new FileOutputStream("my_car.txt");
             ObjectOutputStream ob = new ObjectOutputStream(fos)) {
            Car c = new Car();
            c.id = 10;
            c.model = "Audi A8";
            c.maximumSpeed = 270.00;
            ob.writeObject(c);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

        //deserilizacija
        try (FileInputStream fis = new FileInputStream("my_car.txt");
             ObjectInputStream objIn = new ObjectInputStream(fis)) {
            Car c = new Car();
            c.id = Integer.parseInt(objIn.readObject().toString());
            c.model = (String) objIn.readObject();
            c.maximumSpeed = Double.parseDouble(objIn.readObject().toString());
            System.out.println(c);
        } catch (IOException | ClassNotFoundException exc) {
            System.out.println(exc.getMessage());
        }


    }
}
