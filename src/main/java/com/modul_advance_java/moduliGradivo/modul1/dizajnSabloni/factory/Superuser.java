package com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.factory;

public class Superuser extends User {

    public Superuser(String username) {
        super(username);
        System.out.println("Superuser " + this.username + " created.");
    }
}
