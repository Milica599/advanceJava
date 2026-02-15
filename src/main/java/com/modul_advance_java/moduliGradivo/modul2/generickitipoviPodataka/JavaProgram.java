package com.modul_advance_java.moduliGradivo.modul2.generickitipoviPodataka;

import java.util.ArrayList;

public class JavaProgram {
    static void main(String[] args) {

        //genericki tipovi su oni tipovi koji se mogu parametrizovati
        //na neki nacin to znaci da su apstraktni
        //ali nisu ograniceni samo na klase i interfejse
        //dok genericki tip ne parametrizujemo mozemo smestati u njega prividno objekte razlicitog tipa
        //navodjenje tipa u okviru <> se zove parametrizacija
        //parametrizacijom generickog tipa mi vrsimo ogranicenje na to koju konkretnim tipom se moze manipulisati
        //ovde konkretno moze se smestiti i obradjivati samo string tip u okviru arraylist
        //ovde je parametrizovano sa String klasom i samo String se moze naci u listi
        //parametrizacija se moze izvrsiti gotovim tipomima npr String,Double,Integer
        //ili nekom nasom klasom
        //za parametrizaciju uvek bez izuzetka koristimo slozeni tip podataka
        // nije moguce parametrrizovati prostim tipom
        // vec se tada koriste wrap tj omotaci prostih tipova Integer,Double..
        //genericku klasu prepoznajemo tako sto ona u svojoj definiciji ima oznaku za parametrizaciju <>
        ArrayList<String> al = new ArrayList<String>();
        al.add("John");
        //cesce ce biti prikazano uz upotrebu diamon operator <>
        //<> je prazan posle jednako i to je za nacin koji se cesce koristi
        ArrayList<String> al1 = new ArrayList<>();
        al.add("John");
        /* kod izmedju dve zvezdice je kada smo bili parametrizovani samo sa jednim tipom
        //ovde koristimo generican tip koji smo mi sami kreirali
        //parametrizovali smo ga omotacem Integer
        //upotrebili skraceni oblik za instanciranje tj kreiranje objekta
       // MyClass<Integer> myObject = new MyClass<>();
        //dodelili smo polju t Tipa T 13 je smo parametrizovali  sa Integer
        //myObject.t = 13;

        //sada so genericki tip parametrizovali sa String
        //MyClass<String> myObject1 = new MyClass<>();

        // dodali smo polju t Tipa T string vrednost;
        //myObject1.t = "JONGHJ";

        //parametrizovali boolean tipom tj njegovim omotacemBoolean
        //MyClass<Boolean> myObject3 = new MyClass<>();
         */

        //ovako bi izgledalo da radimo bez parametrizacije eksplicitne
        //ne ogranicavamo tipove koji se se mogu smestiti
        //tada se po navici izvrsi automatska parametrizacija baznom klasom Object
        //tada zbog toga sto svakak klasa koja predstavlja tip podatka nasledjuje Object klasu mozemo mesati tipove
        //koje smestamo npr u kolekcijama smo videli da ako ne zivrsimo parametrizaciju mi dodamo i string i Integer i svasta
        //koliko god da ima parametara bice svi konkretizovani Object klasom ako mi ne napisemo drugacije
        MyClass object4 = new MyClass();

        //parametrizacija sa vise tipova
        MyClass<Integer, String, Boolean> myClass1 = new MyClass<>(35, "My text", true);
        MyClass<Integer, Integer, Integer> myClass2 = new MyClass<>(35, 15, 22);
        //poredjenje da li su obe klase iste
        //vraca true jer je u pitanju klasa koja je samo razlicito parametrizovana
        //porede se klase a ne sadrzaj objekta rezultat true
        System.out.println(myClass1.getClass().equals(myClass2.getClass()));
        //poredi se sadrzaj rezultat false
        System.out.println(myClass1.equals(myClass2));

        //izvrsili smo parametrizaciju brojcanim tipom
        //da smo za mzClass pokusali da izvedemo parametrizaciju sa String bilo bi greska
        MzClass<Integer> myClass = new MzClass<>();
        myClass1.t = 15;
        MzClass<Double> mzClass2 = new MzClass<>();
        mzClass2.t = 15.0;

        //moze da prihvati arument bilo kog tipa jer je to genericna metoda
        showInfo(13);
        showInfo(13.0);
        showInfo(new Object());
        showInfo("jsjsjsjsj");

        //parametrizacija nasim kreiranim tipom
        ArrayList<Student> listStudent = new ArrayList<>();
        ArrayList<Person> listPerson = new ArrayList<>();
        //kreiranje osobe
        Person o = new Person();
        o.name = "John";
        //kreirane studenta
        Student s = new Student();
        s.name = "David";
        s.id = "25/25";
        //dodavanje u adekvatnu listu
        listPerson.add(o);
        listStudent.add(s);

        show(listPerson);
        show(listStudent);
        show1(listPerson);
        show1(listStudent);

    }

    //kreirali smo genericku metodu
    public static <T> void showInfo(T value) {
        System.out.println(value.getClass().getSimpleName() + " = " + value);
    }

    //ArrayList<Person>
    //ovako napisan show prihvata samo objekte Person tipa u list i ne prolazi za studente
    //moguce parametrizovati Object tipom umesto Person ArrayList<Object> lose
    // ili koristiti wildcard- oznaku za nepoznat tip tj koristi se ?
    //mi smo rekli da je argument person i sve sto nasledi person
    static void show(ArrayList<? extends Person> os) {
        for (Person o : os) {
            System.out.println(o.name);
        }
    }

    //wildcard uz definisanje donjeg limita - desinise se maksimum dubine u hijerarhiji
    //prihvata student person ali i object
    static void show1(ArrayList<? super Student> os) {
        for (Object o : os)
            System.out.println(o);
    }
}
