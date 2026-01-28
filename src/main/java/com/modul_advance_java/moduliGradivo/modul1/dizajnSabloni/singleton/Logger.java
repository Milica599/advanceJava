package com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.singleton;

//singleton
public class Logger {
    private static Logger instance;

    //privatni komstruktor sprecava direktno instanciranje
    private Logger() {
    }

    //logika singletona
    //ako postoji instanca isporucice je ako ne postoji kreiraceje
    //metoda namenjena instanciranju klase Logger
    public static Logger getInstance() {
        if (Logger.instance == null)
            instance = new Logger();
        return instance;
    }

}
