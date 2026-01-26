package com.modul_advance_java.modul1.apstraktneKlaseIInterfejsi;

//interfejs najvisi nivo apstrakcije

public interface Storable {

    //interfejs uvek ima javne abstraktne metode
    // moze i void() read(); jer se abstract i public podrazumevaju

    public abstract void read();
    public abstract void write();
    public abstract void update();
    public abstract void delete();

    //default metode ,neapstraktne- podrazumevane
    //pogodno za slucaj kada zelimo da dodamo novu metodu tj funkcionalnost

     default boolean exists(){
         method1();
         method2();
         return true;
     }

     //privatne metode
     //za slucaj kada iz tela jedne metode zovemo drugu metodu
    //namenjeno samo lokalnoj upotrebi

    private void method1() {
        System.out.println("Hello from private method1");
    }

    private void method2() {
        System.out.println("Hello from private method2");
    }
}
