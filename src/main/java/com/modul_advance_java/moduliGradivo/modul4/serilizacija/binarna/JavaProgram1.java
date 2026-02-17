package com.modul_advance_java.moduliGradivo.modul4.serilizacija.binarna;

import java.io.*;

//kad isprobavas mora fajl da bude prazan
public class JavaProgram1 {
    static void main(String[] args) {
        Car c = new Car();
        c.id = 10;
        c.model = "Audi A8";
        c.maximumSpeed = 270.00;

        //objektni tokovi se koriste za serilizaciju
        //serijalizacija svakog svojstava
        try (FileOutputStream fos = new FileOutputStream("my_car.txt");
             //omogucava rad direktno sa objektima
             //objektni tok je takodje omotac
             ObjectOutputStream ob = new ObjectOutputStream(fos)) {
            ob.writeObject(c.id);
            ob.writeObject(c.model);
            ob.writeObject(c.maximumSpeed);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

        //deserilizacija
        try (FileInputStream fis = new FileInputStream("my_car.txt");
             ObjectInputStream objIn = new ObjectInputStream(fis)) {
            Car c1 = new Car();
            //parseint pretvara string u int
            c1.id = Integer.parseInt(objIn.readObject().toString());
            c1.model = (String) objIn.readObject();
            c1.maximumSpeed = Double.parseDouble(objIn.readObject().toString());
            System.out.println(c1);
        } catch (IOException | ClassNotFoundException exc) {
            System.out.println(exc.getMessage());
        }

    }
}
