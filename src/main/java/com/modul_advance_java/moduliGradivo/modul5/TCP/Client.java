package com.modul_advance_java.moduliGradivo.modul5.TCP;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//demonstrirana komunikacija kroz google brovser
public class Client {
    static void main(String[] args) {
        try (Socket socket = new Socket("www.google.com", 80);
             //ulazni tok
             BufferedReader bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             //izlazni tok
             BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream())) {
            //pisanje zahteva
            //argument je http zahtev u navodnicim je i to najednostavniji
            bos.write(("GET /search?q=java HTTP/1.1\r\n\r\n").getBytes());
            //prosledjivanje poruke ide sa flush i close
            //ovde je bolji flush jer odu podaci a tok komunikacije je otvoren
            bos.flush();
            //cita podatke iz toka
            String line = bis.readLine();
            while (line != null) {
                System.out.println(line);
                line = bis.readLine();
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
