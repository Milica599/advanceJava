package com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.factory;

public class Admin extends User {

    public Admin(String username) {
        super(username);
        System.out.println("Admin " + this.username + " created.");
    }
}

