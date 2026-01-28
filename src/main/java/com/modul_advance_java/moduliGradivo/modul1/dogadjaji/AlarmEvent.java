package com.modul_advance_java.moduliGradivo.modul1.dogadjaji;

import java.util.EventObject;

//ovo je objekat dogadjaja
// EventObject je osnovna klasa koja predstavlja dogadjaje
public class AlarmEvent extends EventObject {
    //polje koje cuva informaciju o tekstu dogadja
    String message;

    //konstruktor
    //source je parametar koji je potreban za roditeljski konstruktor
    public AlarmEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}
