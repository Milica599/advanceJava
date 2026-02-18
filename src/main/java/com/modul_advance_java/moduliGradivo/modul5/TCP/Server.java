package com.modul_advance_java.moduliGradivo.modul5.TCP;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static void main(String[] args) {
        //mora se zatvoriti konekcija najbolje u try
        //try with resource automatski zatvara konekciju ne moramo mi da vodimo racuna o tome
        //serversocket je server
        //1080 je port
        //isprobaj konekcija se kreira otidji u browser
        // i ukucaj local host1080 i program ce nastaviti sa radom
        //socket je bolje da stoji u resource delu isto mora da se zatvori
        //blokirajuca metoda accept
        //ceka sve dok ne pristigne neka konekcija koju je inicirao klijent
        //to kreira tj otvara nasu konekciju sa klijentom
        //accept vraca socket
        //sout je premestena ovde iz try bloka  kako bi smislen bio nje prikaz
        System.out.println("listening...");
        try (ServerSocket serverSocket = new ServerSocket(1080);
             Socket cn = serverSocket.accept();
             BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
             BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream())) {
            System.out.println("Client connected!");
            System.out.println("Client message:");
            //citanje podataka
            String line = bis.readLine();
            while (line != null && !line.equals("")) {
                System.out.println(line);
                line = bis.readLine();
            }
            //pisanje sta ce se poslati klijentu
            //nece biti prikazana u browseru jer nije striktno ispostovan http protokol
            //na mozili ce prikazati ali google ne
            //odredjeni browseri zahtevaju striktno da se ispostuje http protokol
            //ressenje u sledecoj lekciji
            bos.write("Hello from java tcp server".getBytes());
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

    }
}
