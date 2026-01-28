package com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.observer;

public interface Observable {
    //dodaje
    void addObserver(Observer s);

    //uklanja
    void removeObserver(Observer s);

    //obavestava
    void notifyObservers(String msg);
}
