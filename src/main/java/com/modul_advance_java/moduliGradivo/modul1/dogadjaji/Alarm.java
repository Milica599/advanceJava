package com.modul_advance_java.moduliGradivo.modul1.dogadjaji;

import java.util.Timer;
import java.util.TimerTask;

//ovo je izvor dogadjaja
public class Alarm {

    //u nizu se nalaze svi slusaoci dogadjaja
    private AlarmListener[] listeners = {};

    //dodaje slusaoca dogadjaja
    public void addListener(AlarmListener alarmListener) {
        //kompleksnija logika zbog nizova bolje je da se koriste kolekcije(kolekcije ucimo kroz modul2)
        //kreiramo novi niz slusaoca dogadjaja koji je duzi za 1 element
        AlarmListener[] newListeners = new AlarmListener[listeners.length + 1];
        //kopira se niz sa dotadasnjim slusaocima i doda se novi element u njega - slusaoc
        //srcpos odredjuje odakle startuje kopiranje
        //destpos odredjuje od koje pozicije krece upisivanje
        System.arraycopy(listeners, 0, newListeners, 0, listeners.length);
        //upisivanje element koji dodajemo u niz
        newListeners[listeners.length] = alarmListener;
        //prebacivanje reference
        //polje sada sadrzi novi niz newListeners i ono postaje nase polje
        listeners = newListeners;
    }

    public void removeListener(AlarmListener alarmListener) {
        //index slusaoca koji treba da se ukloni
        int indexOfElementToRemove = -1;
        //krecemo se kroz niz slusaoca
        for (int i = 0; i < listeners.length; i++) {
            //proveramo da li postoji taj slusaoc kog treba da uklonimo
            if (alarmListener.equals(listeners[i]))
                //ako postoji pamtimo index na kom se nalazi
                indexOfElementToRemove = i;
        }
        //kreiramo novi niz slusaoca koji je kraci za 1 element
        AlarmListener[] newListeners = new AlarmListener[listeners.length - 1];
        //kopiramo do elementa koji treba da uklonimo
        System.arraycopy(listeners, 0, newListeners, 0, indexOfElementToRemove);
        //kopiramo od prvog sledeceg u dnosu na elemetn tj slusaoca kog treeba da obrisemo
        System.arraycopy(listeners, indexOfElementToRemove + 1,
                newListeners, indexOfElementToRemove,
                listeners.length - indexOfElementToRemove - 1);
        //prebacujemo referencu polja
        //polje sada pokazuje na  skraceni niz slusalaca
        listeners = newListeners;
    }

    public void setTimeFromNow(int milis) {

        Timer timer = new Timer("Timer");
        //schedule zakazuje zadatak - zakazuje kad ce da zvoni
        //prvi parametr od schedule je anonimna klasa tj njena instanca
        // drugi parametar je vreme u mili sekundama
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("AlarmEvent trigered...");
                //prolazi se kroz listu slusalaca
                for (AlarmListener listener : listeners) {
                    //eventobj je objekat dogadjaja i u njemu se nalazi informacija o dogadjaju koji je izvor generisao
                    //izvor dogadjaja je this tj klasa alarm
                    AlarmEvent eventObj = new AlarmEvent(this, "Time is up!");
                    //ovde je slusaoc dobio obavestenje o dogadjaju - budilnik je zazvonio
                    //prima eventobj jer je to dogadjaj koji je generisan pomocu klase alarm
                    listener.alarmRang(eventObj);
                }
                //aplikacija zavrsava rad
                System.exit(0);
            }
        }, milis);
    }


}
