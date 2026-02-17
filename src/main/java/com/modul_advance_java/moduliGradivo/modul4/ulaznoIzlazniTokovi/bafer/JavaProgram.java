package com.modul_advance_java.moduliGradivo.modul4.ulaznoIzlazniTokovi.bafer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//baferovani tokovi i rad sa njima ne podrazumevaju direktnu intervenciju nad fajl sistemo
//nema direktnog pristupa disku bilo lokalnom bilo mreznom
//bafer je centralna figura baferovanih tokova
//bafer posebna vrsta memorijskog prostora
// namenjenog za podatke kojima se cesto pristupa zbog citanja ,pisanja
//vrste buffer tokova
//BufferedInputStream
// BufferedOutputStream
// BufferedReader
// BufferedWriter
public class JavaProgram {
    static void main(String[] args) throws FileNotFoundException {
        //baferovani tokovi predstavljaju neku vrstu omotaca za tokove nizeg reda
        //omotac za tok karaktera ili bajtova
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("my_file.txt"))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
