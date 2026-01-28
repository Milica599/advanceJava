package com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.observer;

//definicija sta me interesuje
//ovo je dogadjaj
public class Subject implements Observable {

    //niz slusalaca
    private Observer[] observers = {};

    @Override
    public void addObserver(Observer observer) {
        //ista logika kao za dodavanje slusaoca dogadjaja
        Observer[] newObservers = new Observer[observers.length + 1];
        System.arraycopy(observers, 0, newObservers, 0, observers.length);
        newObservers[observers.length] = observer;
        observers = newObservers;
    }

    @Override
    public void removeObserver(Observer observer) {
        //ista logika kao za uklanjanje slusaoca
        int indexOfElementToRemove = -1;
        for (int i = 0; i < observers.length; i++) {
            if (observer.equals(observers[i]))
                indexOfElementToRemove = i;
        }
        Observer[] newObservers = new Observer[observers.length - 1];
        System.arraycopy(observers, 0, newObservers, 0, indexOfElementToRemove);
        System.arraycopy(observers, indexOfElementToRemove + 1, newObservers, indexOfElementToRemove, observers.length - indexOfElementToRemove - 1);
        observers = newObservers;

    }

    //poziva je izvor dogadjaja
    @Override
    public void notifyObservers(String msg) {
        //obavestenje o objektu dagadjaja
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}

