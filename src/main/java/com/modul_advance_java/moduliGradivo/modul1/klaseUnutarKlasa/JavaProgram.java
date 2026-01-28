package com.modul_advance_java.moduliGradivo.modul1.klaseUnutarKlasa;

import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class JavaProgram {
    static void main(String[] args) {
        //instanciranje ugnezdene ne staticke klase
        // da bi se kreirala instanca ne staticke ugnezdene klase neophodna je instanca top level klase
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();

        //poziv metode ne staticke ugnezdene klase
        innerObject.accessOuterClass();

        //nacin da se instancira lokalna klasa- klasa koja je kreirana u metodi
        OuterClass obj = new OuterClass();
        obj.testMethod(10);

        //new interface-or-class-name() { class-body } formula anonimne klase
        //timerTask klasa je apstraktna klasa za iyvrzavanje zadatka nakon nekkog vremena
        //kreira se odma instanca te klase pa se u nastavku nakon poziva konstruktora pise samo uputstvo po kom ce se objekat kreirati
        //apstraktna klasa je tip TimerTask
        //posto nju nije moguce instancirati apstraktnu klasu pravimo privremenu ananonimnu klasu
        //gde implementiramo run metodu

        //kreiranje instance anonimne klase
        //anonimna nasledi timertask
        TimerTask myTimerTask = new TimerTask() { //pocinje telo anonimne klase -ovo je logika javine timer klase
            //logika anonimne klase implementacija run metode
            public void run() {
                System.out.println("Hello World");
                System.exit(0);
            }
        };

        System.out.println("cao ");
        //timer je ugradjena klasa  njoj pripada schedule
        //kreiranje instance timer klase -upravlja nitima
        Timer timer = new Timer("Timer");
        //definisanje vremena
        long delay = 5000L;
        //schedule obavlja zadatak
        //ako hocu anonimni objekat telo anonimne klase prosledim kao parametar metodi schedele
        //umesto myTimerTask anonimnu klasu (new TimerTask(){...})
        timer.schedule(myTimerTask, delay);

        //kreiranje niza kome unapred znamo elemete
        int[] numbers = {13, 8, -9, 15, -1, -78, 5, 69};
        //lokalna klasa
       /*
       class MyPredicate implements IntPredicate {

           @Override
           public boolean test(int value) {
               return (value > 0);
           }
       }*/
        //instanciranje lokalne klase
        // MyPredicate myPredicate = new MyPredicate();

        //ista logika kao sa lokalnom klasom dostano optiminizovano upotrebom anonimne klase
        //moze jos da se optimiyuje
       /*
       IntPredicate myPredicate = new IntPredicate() {

           @Override
           public boolean test(int value) {
               return (value > 0);
           }
       };*/
        //stream pretvori u tok
        //filter preradi
        //toArray ponovo tok pretvori u niz
       /*
       //ova linija ce se dalje optimizovati
       numbers = Arrays.stream(numbers).filter(myPredicate).toArray();*/
       /* koristi se anonimni objekat ista logika kao za anonimnu klasu moze jos da se optimizuje lambdom
       numbers = Arrays.stream(numbers).filter(new IntPredicate() {
           @Override
           public boolean test(int value) {
               return (value > 0);
           }
       }).toArray();*/
      /*
       //upotreba lambda izraza
       //lambda se obelezava sa  ->
       //ovaj deo je lambda value ->(value > 0) lista argumenata token telo
       //lambda se koristi u kombinaciji sa funkcionalnim interfejsima
       //moye jos da se optimizuje

       */
        numbers = Arrays.stream(numbers).filter(value -> (value > 0)).toArray();
       /*
       //intconsumer je funkcionalni interfej pa anonimni klasa

       Arrays.stream(numbers).forEach(new IntConsumer() {
           @Override
           public void accept(int value) {
               System.out.println(value);
           }
       });
        */

       /*
        //optimizovali upotrebom lambde
       Arrays.stream(numbers).forEach(value -> System.out.println(value));
       */

        //krajnja optimizacija - referenca na metodu
        //::su oznaka na referenca na metodu
        //nas slucaj referenca na metodu za ispis referenca na metodu
        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println(Arrays.toString(numbers));


    }
}
