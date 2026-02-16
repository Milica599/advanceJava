package com.modul_advance_java.moduliGradivo.modul3.datumIVreme;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//svi ovi tipovi  za rad sa datumom i vremenom se nalaze u paketu time
//ljudski razumljiv je LocalDate, LocalTime,LocalDateTime
public class JavaProgram {
    static void main(String[] args) throws InterruptedException {
        //LocalDate je klasa za rad sa datumom
        //LocalDate klasa datum formatira godina- mesec-dan
        //metodom now() dobijamo trenutni datum tj danasnji dan
        System.out.println(LocalDate.now());

        //kreiranje objekta tipa LocalDate
        LocalDate now = LocalDate.now();
        //getYear() je metoda koja nam vraca trenutnu godinu zato sto smo objektu now dodelili sadasnji datum
        //inace getyear() metoda vraca deo koji se odnosi na godinu
        //LocalDate objekat u sebi ima godinu year mesec month i dan day
        // pa imamo i get metode za svaki od tih polja
        System.out.println(now.getYear());

        //of() je staticka metoda koja ce od brojeva u zagradi napraviti datum
        //rezultat staticke metode of() je datum 2021-11-20
        // rezultat od of() metode je LocalDate objekat
        LocalDate date = LocalDate.of(2021, 11, 20);

        //LocalTime je klasa koja predstavlja vreme sat minut sekund je format
        //metoda nov vrati koliko je trenutno sati
        //rezultat ove metode now() je LocalTime objekat
        LocalTime time = LocalTime.now();
        //localTime objekat ima polja hour,minute,second i adekvatne get metode za njih
        System.out.println("Hour: " + time.getHour()
                + " Minutes: " + time.getMinute() + " Seconds: " + time.getSecond());
        //LocalDateTime je objedinjen LocalDate + LocalTime
        LocalDateTime dateTime = LocalDateTime.now();
        //getYear vraca godinu
        int year = dateTime.getYear();
        //getMonthValue() vraca redni broj meseca
        int monthNo = dateTime.getMonthValue();
        //getMonth() vraca ime meseca
        Month monthName = dateTime.getMonth();
        //getDayOfMonth() vraca redni broj dana u godini
        int day = dateTime.getDayOfMonth();
        //getHour() vraca sat redni
        int hour = dateTime.getHour();
        //getMinute() vraca minut redni u satu
        int minutes = dateTime.getMinute();
        //getSecond() vraca sekund u minutu
        int seconds = dateTime.getSecond();

        System.out.println("Today is " + monthName + " " + day + ", " + year);
        System.out.println("The ordinal number of the month is " + monthNo);
        System.out.println("It is " + hour + " hours " + minutes + " minutes and " + seconds + " seconds");

        //demonstracija za mesece ali moze i za bilo koji deo localDateTime objekta
        //plus + ime polja dodavanje
        //plusMonth() dodace 6 meseci u odnosu na datum na koji se poziva
        System.out.println("6 months from now: " + dateTime.plusMonths(6));
        // minusMonth() 6 meseci pre zadatog datuma
        //minus + ime polja oduzimanje
        System.out.println("6 months ago: " + dateTime.minusMonths(6));

        //dokaz da se localDateTime od local Date i Time
        //kreiranje datuma i vremena metodom of()
        LocalDate localDate = LocalDate.of(1999, 12, 13);
        LocalTime localTime = LocalTime.of(17, 50);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        //kreiranje datuma i vremena metodom of()
        LocalDateTime localDateTime1 = LocalDateTime.of(1999, 12, 13, 17, 50);

        //Instant objekat cuva datum i vreme u obliku koji razum masina,izrezen je u nano sekundama
        //nov trenutno vreme
        //instant klasa se koristi za predstavljanje trenutka vremena
        Instant instant1 = Instant.now();
        //broj sekundi koji je protekao od pocetka epohe
        //pocetak epohe je 1.1.1970
        System.out.println(instant1.getEpochSecond());

        //racunanje proteklog vremena izmedju dva trenutka
        Instant instant = Instant.now();
        Thread.sleep(1000);
        //razlika u sekundama
        long period = instant.until(Instant.now(), ChronoUnit.SECONDS);
        System.out.println(period);

        //pretvaranje  masinskog vremana u ljdsko vreme ofInstant
        Instant instant2 = Instant.now();
        LocalDateTime ldt = LocalDateTime.ofInstant(instant2, ZoneId.systemDefault());
        System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
                ldt.getYear(), ldt.getHour(), ldt.getMinute());

        //parsiranje  string u datum parse()
        String in = "19880505";
        LocalDate date1 = LocalDate.parse(in, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(date1);

        //ako je nestandardni oblik datuma kao string
        String in1 = "05 05 1988";
        try {
            //kreiramo objekat za frmatiranje
            //ofPatern zadaje format datuma
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
            //pretvorice string u datum pomocu sablono koji smo kreirali
            LocalDate date2 = LocalDate.parse(in1, formatter);
            System.out.println(date2);
            //navodi se koji format zelimo za datum ako ima vise formater-a
            System.out.println(date2.format(formatter));
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }

        /*
        oblici formtiranje navodimo kojim mi zelimo redom poput dd MM yyyy
                y	godina
                D	dan u godini
                M	mesec u godini
                d	dan u mesecu
                h	sati (1–12)
                H	sati (1–24)
                m	minuti
                s	sekunde

         */

        LocalDate now1 = LocalDate.now();
        LocalDate birthday = LocalDate.of(1976, Month.MAY, 1);
        //between racuna period  i vraca Period objekat
        //ima get metode za protekle godine,mesece dane p.getdays npr
        //Perid klasa funkcionise samo z dane mesece i godine
        Period p = Period.between(birthday, now1);
        //vraca period izrazen u danima/mesececima npr koliko smo ostarili
        long p2 = ChronoUnit.DAYS.between(birthday, now1);
        long p3 = ChronoUnit.MONTHS.between(birthday, now1);
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                " months, and " +
                p.getDays() +
                " days old. (" + p2 + " days total or " +
                p3 + " months)");

        //ista logika kao za period samo je ovde izrazeo u sekundama u okviru duration objekta
        LocalTime time1 = LocalTime.now();
        Thread.sleep(1000);
        LocalTime time2 = LocalTime.now();
        //between od trenutka1 do trenutka 2
        Duration duration = Duration.between(time1, time2);
        System.out.println(duration.getSeconds());

        LocalDate now5 = LocalDate.now();
        //ispisujemo broj dan u mesecu
        //isLeapYear() proverva zbog februara da li je godina prestupna
        for (Month month : Month.values()) {
            System.out.println(month + " " + month.length(now5.isLeapYear()));
        }


    }
}