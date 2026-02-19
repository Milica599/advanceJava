package com.modul_advance_java.moduliGradivo.modul5.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//UDP protokol je protokol koji se koristi kada  ne garantujemo da ce poslati podaci
//zapravo i stici do primaoca
//kada se komunikacija vrsi UDP protokolom nije nam potrebna potvrda o komunikaciji
//Centralna figura UDP protokola je pojam datagram.
// Datagram je pojam koji se odnosi na poruku čija isporuka nije zagarantovana.
//postize isto sto i TCP ali sa razlikom oko sigurnosti isporuke podataka
//UDP je za sisteme kojim aje bitnija brzina od sigurnosti

public class Server {
    static void main(String[] args) {
        //while omogucava veci broj poruka
        //1 ili vise klijenata
        while (true) {
            //vezuje lokalnu IP adresu i odredjeni port-datagramSocket
            //emituje socket exception koji je hijerarhijski ispod ioexception
            //oba exceptiona hvatamo preko io
            try (DatagramSocket datagramSocket = new DatagramSocket(1080)) {
                System.out.println("listening...");
                //skladiste dolazecih poruka
                // ne vece od 512
                byte[] buffer = new byte[128];
                // p je jedna poruka  koja ce se smestati kasnije u skladiste poruka
                DatagramPacket p = new DatagramPacket(buffer, buffer.length);
                //inicira se slusanje
                datagramSocket.receive(p);
                //poruka se pretvara u String
                //poruka,pocetak,duzina
                String message = new String(p.getData(), 0, p.getLength());
                System.out.println(message);
                buffer = "Hello from UDP server".getBytes();
                p = new DatagramPacket(buffer, buffer.length, p.getAddress(), p.getPort());
                datagramSocket.send(p);
            } catch (IOException exc) {
                System.out.println(exc.getMessage());
            }
        }

    }
}

