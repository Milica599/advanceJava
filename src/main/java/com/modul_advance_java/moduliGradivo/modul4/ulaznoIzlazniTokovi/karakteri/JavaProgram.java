package com.modul_advance_java.moduliGradivo.modul4.ulaznoIzlazniTokovi.karakteri;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//tokovi bajtova i tokovi karaktera imaju direktnu intervenciju nad fajlom
public class JavaProgram {
    static void main(String[] args) {
        String myText = "Hello World";
        //komforniji nacin
        // tok karaktera za pisanje u fajl
        try (FileWriter fw = new FileWriter("my_file.txt")) {
            //pise u fajl write()
            fw.write(myText);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

        //fileReader cita karaktere iz fajla
        try (FileReader fr = new FileReader("my_file.txt")) {
            //karakter gde cemo smestati procitani karakter
            int c;
            //proveravamo da li je prcitani karakter -1
            //ako jeste citanje je zavrseno
            while ((c = fr.read()) != -1)
                //ispisujemo sta smo procitali
                //bez kastovanja dobili bi kod karaktera iz ascii
                System.out.print((char) c);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
