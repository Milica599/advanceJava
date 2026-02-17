package com.modul_advance_java.moduliGradivo.modul4.serilizacija.tekstualna.xml;
/*
XML je skraćenica za eXtensible Markup Language. Reč je o jeziku za obeležavanje,
odnosno markiranje (markup language) koji je po svojim osobinama veoma
sličan osnovnom jeziku za kreiranje strukture web stranica – jeziku HTML.
Ipak, XML ne poseduje unapred utvrđen skup oznaka,
već tvorac dokumenta ima mogućnost da samostalno definiše proizvoljne oznake za markiranje teksta
 */

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaProgram {
    static void main(String[] args) {
        Car c = new Car();
        c.setId(10);
        c.setModel("Audi A8");
        c.setMaximumSpeed(270.00);
        //fajl uvek .xml
        try (FileOutputStream fos = new FileOutputStream("my_car.xml");
             //serilizacija xml se radi klasom XMLEncoder
             XMLEncoder xmlEncoder = new XMLEncoder(fos)) {
            //pisanje u fajl
            xmlEncoder.writeObject(c);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("my_car.xml");
             //deserilizacija XMLDecoder
             XMLDecoder xmlDecoder = new XMLDecoder(fis)) {
            Car c1 = (Car) xmlDecoder.readObject();
            System.out.println(c1);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

    }
}
