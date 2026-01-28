package com.modul_advance_java.moduliGradivo.modul1.klaseUnutarKlasa;

public class OuterClass {

    static int j;
    private int i;

    private void m() {
        System.out.println(i);
    }

    //metoda za potrebe bloka
    void testMethod(int x) {

        int y = x * 2;

        //lokalna klasa
        //nije je moguce koristiti van bloka
        class LocalClass {

            final int a;
            final int b;

            public LocalClass() {
                a = x;
                b = y;
            }

        }

        LocalClass lc = new LocalClass();

        System.out.println(lc.a);
        System.out.println(lc.b);
    }

    //ne moze da pristupi elementima top level klase koji nisu staticki
    static class StaticNestedClass {
        // moye da pristupi j jer je static element tj on je klasni element
        void doSomething() {
            j = 10;
        }
    }

    //u nestatickoj ugnezdenoj klasi mozemo da pristupimo poljima i metodama spoljnje klase
    class InnerClass {

        void accessOuterClass() {
            i = 1;
            m();
        }
    }


}
