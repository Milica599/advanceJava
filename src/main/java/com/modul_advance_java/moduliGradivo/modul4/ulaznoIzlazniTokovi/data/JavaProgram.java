package com.modul_advance_java.moduliGradivo.modul4.ulaznoIzlazniTokovi.data;

import java.io.*;

public class JavaProgram {
    static void main(String[] args) {
        int variableA = 13;
        double variableB = 13.13;
        String variableC = "Hello!";

        //tokovi data tok je omotac za tokove bajtova
        //uvek ali uvek data kao argument prima tok nizeg reda
        //upisivanje u fajl
        //podaci se upisuju u ljudima nerazumnom obliku
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("my_file.txt"))) {
            //write + tip (int,double,utf=tekst,string)
            out.writeInt(variableA);
            out.writeDouble(variableB);
            out.writeUTF(variableC);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

        //citanje iz fajla redom kojim su upisani mora
        try (DataInputStream in = new DataInputStream(new FileInputStream("my_file.txt"))) {
            System.out.println(in.readInt());
            System.out.println(in.readDouble());
            System.out.println(in.readUTF());
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
