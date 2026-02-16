package com.modul_advance_java.moduliGradivo.modul3.napredniRadSaTekstom.funkcionalnosti;
/*
toCharArray() – pretvara String u niz karaktera;
length() – vraća dužinu String-a u karakterima;
toUpperCase() – pretvara sva slova String-a u velika;
toLowerCase() – pretvara sva slova String-a u mala;
trim() – uklanja prazne karaktere sa početka i kraja String vrednosti;
indexOf() – pronalazi indeks na kome se nalazi neki karakter ili tekst;
charAt() – vraća karakter koji se nalazi na prosleđenoj poziciji;
substring() – kreira isečak String-a;
equals() – poredi dve String vrednosti;
startsWith() – proverava da li String započinje određenim skupom karaktera;
endsWith() – proverava da li se String završava određenim skupom karaktera;
replace() – vršu zamenu određenih karaktera u String-u;
split() – deli String na više delova.*/


//tekstualni podaci se predztavljaju tipom String
//String je referentni odnosno slozeni tip podatka odnosno objektni tip
//po definiciji se referenca na objekat cuva na stack a sama vrednos se cuva na heapu
//kreiramo ih na isti nacin kao i proste tipove iako se u pozadini poziva new sa konstruktorom
//Stringovi su po definiciji ne promenljivi objekti tj oni su immutable objekti
//dokaz i objasnjenje zasto su immutable se nalazi u objasnjenju konkatenacije odnosno spajanja stringova

import java.util.stream.Stream;

public class JavaProgram {
    static void main(String[] args) {

        //ovako kreiran Steing se zove String literal
        String message = "Hi!";

        //kreirani kao String literali
        String myString = "My ";
        String myString1 = "string";

        //konkatenacija stringova se radi operatorom +
        //u pozadini se kreira novi String koji je nastao spajanjem ova dva String
        System.out.println(myString + myString1);

        //istu stvar postizemo i pozivom metode concat
        //kreira se u pozadini novi string koji ima u sebi oba ova stringa
        System.out.println(myString.concat(myString1));

        //ovo je isto konkatenacija koja se postize upotrebom StringBuilder objekta
        //StringBuilder objekat je tekst koji je sam po sebi prosiriv
        //StringBuilder je String sa dinamickom strukturom
        //metodom append dodajemo tekst u stringBuilder objekat
        //StringBuilder je mutable tj promenljiv je
        System.out.println(myString + myString1);

        //metoda isBlank() proverava da li string u sebi sadrzi neki karakter
        //slicna je sa metodom isEmpty
        //razlika isBlank ako unesemo ako unesemo za string samo karaktere razmaka vrati true
        //ako nema slova brojeva specijalnih karaktera vraca true
        //ako ima bilo sta vraca false
        //npr "" ovo je true, ali je i ovo true "  "
        System.out.println(("").isBlank());

        //metoda vraca da li je String prazan
        // npr "" ovo je true, npr "   " ovo je false
        System.out.println(("   ").isEmpty());

        //ovo je string koji sadrzi oznake za novi red
        // oznaka za novi red je /n ,/r/n
        // n je za windows,/r/n za linux i ostale
        String str = "first line \nsecond line \nthird line \nfourth line";
        //lines() metodom string delimo na redove
        //rezultat ove metode lines() je tok podataka tj stream
        Stream<String> lines = str.lines();
        //ova linija je identicna kao u linijama iz lekcije tokovi
        //forEach je terminalna metoda koja na sluzi za ispis ili obradu svakog elementa u toku
        //ovde smo forEach kombinovali sa referencom na metodu
        lines.forEach(System.out::println);

        //kreirali smo string literal
        String str1 = "first line \nsecond line \nthird line \nfourth line";
        //metoda indent sluzi za uvlacenje stringa tj za razmak od ivice leve ako imamo vise linijski string
        //njen argument je broj karaktera za koji uvlacimo redove stringa
        //svaki red stringa ce se uvuci
        String indentedString = str1.indent(6);
        System.out.println(indentedString);

        String str2 = "Hello World";
        //metodom repeat() ponavljamo string
        //nadovezujemo ga na samog sebe
        //ponovice se 3 puta hello world
        //argument je broj ponavljanja
        String repeatedStr = str.repeat(3);
        System.out.println(repeatedStr);

        //tradicionalni nacin da se u String objekat smesti HTML kod
        //ovaj nacin nije dobar jer ga nece prepoznati kao kod,vec kao samo obican teks
        String myString11 =
                "<html>\n" +
                        "<head>\n" +
                        "\t<title>My HTML Document</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\t<p>Hello from my paragraph</p>\n" +
                        "</body>\n" +
                        "</html>";

        System.out.println(myString11);

        //ovo je isto string objekat ali cemo se prema njemu ponasati kao prema specijalno tekstu
        //specijalni teks je kod nekog jezika koji ce nam npr ulepsati ekran
        //ovo je vazno kad se bude radilo web programiranje
        //ovaj nacin se postize specijalnim tumacenjem navodnika koji se zove teks blok
        String myString12 = """
                <html>
                <head>
                    <title>My HTML Document</title>
                </head>
                <body>
                    <p>Hello from my paragraph</p>
                </body>
                </html>""";

        System.out.println(myString12);
        //prikazace sve ruzno u jednom redu
        //pokretanjem programa cemo se uveriti u to
        String myString22 = "Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit. " +
                "Nam vitae mollis arcu, vel sodales " +
                "tortor. Nam sit amet diam ex. Integer " +
                "ullamcorper sem et magna imperdiet " +
                "accumsan et eu sapien. Cras vel aliquam " +
                "quam. Cras auctor magna ac tempor pulvinar. " +
                "Suspendisse accumsan libero varius eros " +
                "fermentum, in mattis libero ornare. Nam " +
                "elementum dui nec urna sodales, " +
                "non tempor quam semper.";

        System.out.println(myString22);
        //jos jedna upotreba tekst blokova kada hocemo lep prikaz,
        //karakter \ je ovde zbog preglednost u kodu nece ga prikazati stvarno
        //prikazuje se kao jednolinijski, kao i prethodni
        //a u konzoli ga prikaze lepo formatirano
        String myString23 = """
                Lorem ipsum dolor sit amet, \
                consectetur adipiscing elit. \
                Nam vitae mollis arcu, vel sodales \
                tortor. Nam sit amet diam ex. Integer \
                ullamcorper sem et magna imperdiet \
                accumsan et eu sapien. Cras vel aliquam \
                quam. Cras auctor magna ac tempor pulvinar. \
                Suspendisse accumsan libero varius eros \
                fermentum, in mattis libero ornare. Nam \
                elementum dui nec urna sodales, \
                non tempor quam semper.""";

        System.out.println(myString23);

    }
}
