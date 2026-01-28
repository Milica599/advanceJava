package com.modul_advance_java.moduliGradivo.modul1.dogadjaji;

//interfejs koji predstavlja slusaoce
//slusaoci su predstavljeni interfejsom jer tako izbegnemo ogranicenje tipova
//funkcionalni interfejs
public interface AlarmListener {
    //javna apstraktna metoda
    void alarmRang(AlarmEvent event);
}
