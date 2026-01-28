package com.modul_advance_java.moduliGradivo.modul1.refleksija;

import java.lang.reflect.*;
import java.util.Arrays;

public class JavaProgram {
    static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //ispitivanje tipa cije ime znamo
        Class<Product> productClass = Product.class;

        //imamo objekat ali ne znamo naziv tipa koji yelimo da ispitamo
        Product product1 = new Product("Logitech", "F710", 129.99);
        Class productClas = product1.getClass();

        //forName baca gresku ili obrada u try catch ili odabrati throws
        try {
            //mora puno ime zbog toga sto imamo dve klase sa istim nazivom
            Class productClasss = Class.forName("com.modul_advance_java.moduliGradivo.modul1.refleksija.Product");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //ispitujemo osobine string
        Class stringClass = String.class;
        //vraca pun naziv klase i svih paketa u kojima je
        String className = stringClass.getName();
        //ime klase ali bez imena paketa
        String simpleClassName = stringClass.getSimpleName();
        //vraca odredjenu numericku vrednost koja oslikava odredjeni modifikator vidljivosti
        int modifiers = stringClass.getModifiers();
        //vraca paket u kom seklasa nalazi
        Package classPackage = stringClass.getPackage();
        //vraca roditeljsku klasu
        Class superclass = stringClass.getSuperclass();
        System.out.println(className);
        System.out.println(simpleClassName);
        //za svaki modifikator da li je to on ili nije
        System.out.println("Is private: " + Modifier.isPrivate(modifiers));
        System.out.println("Is public: " + Modifier.isPublic(modifiers));
        System.out.println("Is final: " + Modifier.isFinal(modifiers));
        System.out.println(classPackage.getName());
        System.out.println(superclass.getName());

        //ispitujemo sve konstruktore klase Product
        //niz sa konstruktorima
        productClass = Product.class;
        Constructor[] constructors = productClass.getConstructors();
        //prolazimo kroz niz konstruktora
        for (Constructor constructor : constructors) {
            //ispisujemo broj parametara za konstruktor
            System.out.println(constructor.getParameterCount());
        }

        for (Constructor constructor : constructors) {
            //ispitujemo tip parametara u konstruktorima
            System.out.println(Arrays.toString(constructor.getParameterTypes()));
        }

        productClass = Product.class;
        try {
            //isporucuje trazeni konstruktor  -3 parametra
            Constructor constructor = productClass.getConstructor(String.class, String.class, double.class);
            //newinstance salje parametre isporucenom konstruktoru
            Product product = (Product) constructor.newInstance("Logitech", "F710", 129.99);
            System.out.println(product);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }

        //rukujemo poljima pomocu refleksije
        productClass = Product.class;
        //isporucuje niy polja klase product bez obzira na modifikator private
        //ako zelimo samo javna polja getFields
        //ako zelimo samo jedno polje onda je to getField()
        Field[] fields = productClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        //citanje polja preko refleksije
        product1 = new Product("Logitech", "F710", 129.99);
        productClass = Product.class;
        //sva polja
        fields = productClass.getDeclaredFields();
        //prolazimo kroy sva polja
        for (Field field : fields) {
            try {
                //setaccesible omogucava citanje vrednosti privatnih polja
                field.setAccessible(true);
                //ispisujemo naziv svojsta pa njegovu vrednost iy kreiranog objekta -polje od product1
                System.out.println(field.getName() + ": " + field.get(product1));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        //postavljanje vrednosti polja refleksijom
        Product product12 = new Product();
        productClass = Product.class;
        //niz sa svim poljima klase product
        fields = productClass.getDeclaredFields();
        //prolazimo kroz polja
        for (Field field : fields) {
            //pristup poljima koja nisu javna vec privatna
            field.setAccessible(true);
            //za svako polje proveravamo tip da li je odgovarajuc
            if (field.getType() == String.class) {
                //proveravamo da li ime tog polja adekvatno
                if (field.getName().equals("brand")) {
                    //postavljamo vrednost
                    field.set(product12, "Logitech");
                } else if (field.getName().equals("model")) {
                    field.set(product12, "F710");
                }
            } else if (field.getType() == double.class) {
                field.set(product12, 129.99);
            }
        }
        //prikazujemo objekat kom smo postavili vrednosti refleksijom
        //ako u klasi product nema tostring poyvace se iy object
        //ako ima bice lepo prikazano
        System.out.println(product12);

        //rukovanje metodama u klasi product preko refleksije
        productClass = Product.class;
        //sve metode klase product
        //sve metode i koje smo mi pisali i koje smo nasledili od object
        //ako hocemo samo nase getDeclaredMethods();
        Method[] methods = productClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        //referenca na pojedinacnu metodu
        //koja nema parametre
        Method method = productClass.getMethod("toString");
        //referenca na metodu koja ima jedan parametar(ako ih je vise samo ih nabrojimo i razdvojimo ih sa ,)
        Method methoda = productClass.getMethod("setBrand", String.class);

        Product product2 = new Product("Logitech", "F710", 129.99);

        productClas = Product.class;
        //referenca na zadatu metodu
        Method methoda1 = productClass.getMethod("toString");
        //invoke poziva metodu
        //moze bez promenljive ako je void u suprotnom mora varijabla
        //kastamo u string jer je povratna vrednost object
        String returnValue = (String) method.invoke(product1);

        System.out.println(returnValue);


    }
}
