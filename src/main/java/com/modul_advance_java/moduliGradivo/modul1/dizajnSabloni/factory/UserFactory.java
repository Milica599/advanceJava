package com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.factory;

public class UserFactory {

    //posrednicka klasa za kreiranje adekvatnog Usera
    public static User newUser(String userType, String username) {
        User user = switch (userType) {
            case "viewer" -> new Viewer(username);
            case "admin" -> new Admin(username);
            case "superuser" -> new Superuser(username);
            default -> null;
        };

        return user;
    }

}

