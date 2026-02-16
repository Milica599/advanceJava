package com.modul_advance_java.moduliGradivo.modul3.napredniRadSaTekstom.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaProgram {
    static void main(String[] args) {

        String str = "This is a sentence.  This is a question, right?  Yes!  It is.";
        //razdvojimo metodom split string na delove
        //regex tj regularni izraz je argument funkcije split
        String[] wordArray = str.split("[ .,?!]+");
        System.out.println("Return Value: ");
        //ispisujemo svaki element niza wordArray
        for (String s : wordArray) {
            System.out.println(s);
        }

        String str1 = "this is some text";
        //matches metoda proverava da li se ova dva stringa podudaraju direktno tj u potpunosti
        //da bi bilo true treba da budu sadrzajno isti
        boolean match = str1.matches("this is some text");
        System.out.println(match);
        //demonstracija kad je false
        //nema direktnog tj potpunog podudaranja
        String str2 = "this is some text2";
        boolean match1 = str2.matches("this is some text");
        System.out.println(match1);

        String str3 = "A";
        boolean match2 = str.matches(".");
        //. oznacava bilo koji karakter
        //jedna . jedan karakter
        System.out.println(match2);

        String str4 = "AA";
        boolean match3 = str.matches(".");
        //vraca false jer ima dva AA
        System.out.println(match3);

        String str5 = "AA";
        boolean match4 = str.matches("..");
        //vraca true jer ima dva AA
        System.out.println(match4);

        String str6 = "ABC";
        boolean match5 = str.matches("A.C");
        //vraca true jer kaza mora poceti sa A pa bilo sta pa C
        System.out.println(match5);

        String str7 = "ABC";
        //skupovi karaktera se oznacavaju [] i navedu se unutar njih elementi skupa
        //mora A ,[BD]  znaci da onda ide B,D ili BD,DB,ili kako god samo da se pojave ta slova ,pa C
        boolean match6 = str.matches("A[BD]C");
        System.out.println(match6);

        //opseg [] pa na pisemo u njima 0-9 ili a-z ili a-Z
        //ako hocemovise opsega samo ih pisemo u []jednu za drugom [0-9a-z]
        String str8 = "AaC";
        boolean match7 = str.matches("A[0-9]C");
        // mora A pa ide neki broj od 0 do 9 pa ide C
        System.out.println(match7);

        String str9 = "AaC";
        //^ je znak za negaciju
        boolean match8 = str.matches("A[^0-9]C");
        //mora A pa bilo sta sto nije broj 0 do broja 9 pa mora C,da bi bio true rezultat
        System.out.println(match8);
        /*
        Kvantifikator	Značenje
        X?	            jednom ili nijednom
        X*	            nijednom ili više puta
        X+	            jednom ili više puta
        X{n}	        tačno n puta
        X{n, }	        najmanje n puta
        X{n, m}	        najmanje n puta, ali ne više od m puta
        */

        String str10 = "my regular expression";
        boolean match9 = str.matches("m.*");
        //mora m , pa bilokoji znak nijednom ili vise puta
        System.out.println(match9);

        /* specijalne oznake za skracivanje kucanja
        Konstrukcija	Značenje
        \d	            bilo koja cifra
        \D	            sve osim cifara
        \s	            prazan karakter
        \S	            sve osim praznog karaktera
        \w	            bilo koje slovo ili cifra
        \W	            sve osim slova i cifara
        */

        String str11 = "123";
        //pre svakog \d dodajemo jos jedan\ jer je kosa  crta specijalni znak u javi
        // \d je oznaka iz tabele
        //znaci bilo koje tri cifre
        boolean match10 = str.matches("\\d\\d\\d");
        System.out.println(match10);

        //upotreba regex izraza uz klasu Pattern
        //isti efekat smo postigli kao i pozivanjem metode matches nad stringom
        String str12 = "my regular expression";
        //tumacenje regexa je isto m pa bilo koji znak sa tastature o ili vise puta
        boolean match11 = Pattern.matches("m.*", str);
        System.out.println(match11);

        //upotrebom Patern i Matcher klasa imamo mogucnost da vise puta upotrebimo jedan regex
        //bolja opcija jer se skracuje kod,ako za razlicite Stringove proveravamo po istom zahtevu
        String str13 = "This is some text, that will be searched for occurrences of word: some";
        String regex = "some$";
        //kreiranje Patern objelta pomocu metode compile
        //compile() se koristi za kompajliranje regex izraza
        Pattern pattern = Pattern.compile(regex);
        //matcher() prima string koji ce da bude proveren i vraca ga u Matcher objekat
        Matcher matcher = pattern.matcher(str13);
        int count = 0;
        //metoda find() pronalazi poklapanje
        while (matcher.find()) {
            count++;
            System.out.println("found: " + count + " : " + matcher.start() + " - " + matcher.end());
        }
        //rezultat sva podudaranja ce vratiti
        // ali ako je regex = some$ vratice samo prvo podudaranje sa kraja
        //ako regex ostane some$ a mi uklonio poslednje some sa kraja nece vratiti nista

    }
}
