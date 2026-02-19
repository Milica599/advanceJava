package com.modul_advance_java.moduliGradivo.modul5.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Client {
    static void main(String[] args) {
        //klient datagramSocket
        try (DatagramSocket datagramSocket = new DatagramSocket()) {
            //poruka od klienta
            //poruka je u obliku niza bajtova
            byte[] message = "Hello from UDP client".getBytes();
            //iniciranje komunikacije
            //adresa gde ide poruka
            //umesto 127.0.0.1 moze da pise localhost
            InetSocketAddress ep = new InetSocketAddress("127.0.0.1", 1080);
            //poruka koju treba poslati serveru
            //poruka u bajtovima,duzinu,adresu
            DatagramPacket p = new DatagramPacket(message, message.length, ep);
            //slanje poruke
            datagramSocket.send(p);

            //praznjenje buffera tj skladista poruka koje su bile za server
            message = new byte[256];
            //poruka koja se salje
            p = new DatagramPacket(message, message.length, ep);
            //inicira se slusanje
            datagramSocket.receive(p);
            //ispis poruke
            System.out.println(new String(p.getData(), 0, p.getLength()));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
