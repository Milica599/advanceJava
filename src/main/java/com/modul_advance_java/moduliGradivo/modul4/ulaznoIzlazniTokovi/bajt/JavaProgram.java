package com.modul_advance_java.moduliGradivo.modul4.ulaznoIzlazniTokovi.bajt;


import java.io.FileInputStream;
import java.io.IOException;

public class JavaProgram {
    static void main(String[] args) throws IOException {
        //ovo je naredba za ispis
        //ovo je jedan izlazni tok
        //out je polje tog toka
        //a tok je PrintStream
        System.out.println("Hello world");

        String myText = "Hello World";
        //koristim FileoutputStream jer zelim da upisem podatke u
        //moze doci do exception-a da se ne pronadje fajl ili dodati naznaku ili obradu u try catch
        //relativna putanja do fajla zato je kreiran u src
        //FileOutputStream fs = new FileOutputStream("my_file.txt");
        //ovaj try catch finally je los bolji je try with resource
        // jer sprecava zagarantovano curenje memorije
        // jer automatski se tok zatvara
       /*
        try {
            //metodom write() mi upisujemo bajtove u fajl
            //getBytes cita bajtove podataka
            //write moguc io exception
            fs.write(myText.getBytes());
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        } finally {
            //da nema close() metode doslo bi do curenja memorije leak
            fs.close();
        }*/
        /*
        try(FileOutputStream fs = new FileOutputStream("my_file.txt");){
            fs.write(myText.getBytes());
        }catch (IOException exception){
            exception.printStackTrace();
        }*/

        //citanje bajtova iz file fileinputstream
        try (FileInputStream fs = new FileInputStream("my_file.txt")) {
            //read cita bajt po bajt
            int content = fs.read();
            //provera sa -1 jer to znaci da nema sta da procita
            while (content != -1) {
                //bajt kastujemo char
                System.out.print((char) content);
                //cita sledeci bajt
                content = fs.read();
            }
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }


    }
}
