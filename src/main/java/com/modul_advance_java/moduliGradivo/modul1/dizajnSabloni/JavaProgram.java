package com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni;

import com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.decorator.Rectangle;
import com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.decorator.RectangleDecorator;
import com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.factory.User;
import com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.factory.UserFactory;
import com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.factory.Viewer;
import com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.observer.Observer;
import com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.observer.ObserverA;
import com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.observer.Subject;
import com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.singleton.Logger;

public class JavaProgram {
    static void main(String[] args) {
        //dve instance klase moze ih biti vise
        Product product1 = new Product();
        Product product2 = new Product();
        //poredi ih po sadryaju equals
        System.out.println(product1.equals(product2));

        //instanciranje singletona
        //ovo izgleda kao da ima vise objekata Logger klase
        //ali nema jer pokayuju reference na isti objekat na heap-u
        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();
        //dokaz da  je to isti objekat u sustini
        System.out.println(logger.equals(logger1));

        //observer
        //dogadjaj -jedan od dogadjaja vrsta
        //realno veci broj
        //najcesce u mapi
        //vadi se  iz mape dogadjaj po imenu
        //na subject se poziva notify/publish
        Subject subject = new Subject();
        //potencijalni slusaoci dogadjaja
        Observer o1 = new ObserverA("Observer 1");
        Observer o2 = new ObserverA("Observer 2");
        Observer o3 = new ObserverA("Observer 3");
        //zvanicno postaju slusaoci
        subject.addObserver(o1);
        subject.addObserver(o2);
        subject.addObserver(o3);
        //primaju obavestenje o dogadjaju
        subject.notifyObservers("new update");
        //uklanjamo slusaoca dogadjaja
        subject.removeObserver(o2);
        subject.removeObserver(o1);
        //preostali slusaoci dobijaju novo obavestenje o dogadjaju
        subject.notifyObservers("new update1");

        //factory namenjen vrstama
        //tradicionalno kreiranje
        Viewer viewer = new Viewer("John");
        String userType = "viewer";
        String username = "John";
        /*lose je da odabir vrste usera bude ovde -potrebna posrednicka klasa,klasa u kojoj je logika factory
         User user = switch (userType) {
             case "viewer" -> new Viewer(username);
             case "admin" -> new Admin(username);
             case "superuser" -> new Superuser(username);
             default -> null;
         };*/

        //kreiranje preko posrednicke klase tj preko factory sablona
        User user1 = UserFactory.newUser("admin", "John");
        User user2 = UserFactory.newUser("viewer", "Ben");
        User user3 = UserFactory.newUser("superuser", "Tom");

        //decorator
        RectangleDecorator rd = new RectangleDecorator(new Rectangle(2, 3));
        System.out.println(rd.rectangle.area());
        System.out.println(rd.perimeter());
    }
}
