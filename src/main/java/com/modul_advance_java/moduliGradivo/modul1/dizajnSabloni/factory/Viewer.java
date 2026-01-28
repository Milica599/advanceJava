package com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.factory;

public class Viewer extends User {

    public Viewer(String username) {
        super(username);
        System.out.println("Viewer " + this.username + " created.");
    }
}
