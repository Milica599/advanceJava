package com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.observer;

public class ObserverA implements Observer {

    String name;

    public ObserverA(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("Observer " + name + ". Message from observable: " + msg);
    }
}

