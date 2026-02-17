package com.modul_advance_java.moduliGradivo.modul4.serilizacija.binarna;

import java.io.*;

//najbolje je ovo
public class JavaProgram3 {
    static void main(String[] args) {
        //serilizacija celog objekta
        try (FileOutputStream fos = new FileOutputStream("my_car");
             ObjectOutputStream ob = new ObjectOutputStream(fos)) {
            Car c = new Car();
            c.id = 10;
            c.model = "Audi A8";
            c.maximumSpeed = 270.00;
            ob.writeObject(c);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        //deserilizacija celog objekta
        try (FileInputStream fis = new FileInputStream("my_car");
             ObjectInputStream ob = new ObjectInputStream(fis)) {

            System.out.println(ob.readObject());

        } catch (IOException | ClassNotFoundException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
