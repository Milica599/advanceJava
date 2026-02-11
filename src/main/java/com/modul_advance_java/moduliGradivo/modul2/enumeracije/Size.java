package com.modul_advance_java.moduliGradivo.modul2.enumeracije;

//kreiraju se pomocu kljucne reci enum
//unutar enumeracija su grupe konstanti
//enumeracije su i tip podatka jer predstavljaju specijalni oblik klase
//svaka enumeraciona konstanta ima svojsto name - to je ime konstante ,ordinal- redni broj konstante
//svojstva name i ordinal imaju private modifikator pristupa pa im se ne moye pristupiti direktno
//svojstvu name se pristupa pomocu toString metode
//npr sout(size1) tu se u pozadini pozvao to String pa se pristupilo svojstvu name
public enum Size {
    //ovo je grupa konstanti
    //svaka rec je jedna konstanta
    //ovde ima 4 konstante
    //pozadini su ovo 4 staticke promenljive koje su dostupne preko enumeracije Size
    //UNSPECIFIED je konstanta koja kaze da se ponasamo ko da je vrednost null ,
    // ali zbog nje program ne puca ybog UNSPECIFIED
    //da bi mogli da definisemo code spisak konstanti se morao zavrsiti sa ;
    //kada ne kreiramo dodatna svojstva na kraju nabrajanja konstanti ne mora ;
    SMALL("s"),//u zagradi je definisano svojstvo code
    MEDIUM("m"),
    LARGE("l"),
    EXTRA_LARGE("xl"),
    UNSPECIFIED("un");
    //definisanje dodatnih svojstava enumeracije  tj definisanje polja
    //name,ordinal uvek ima ali dodatna svojstva mozemo i sami napraviti
    //dodatna svojstva se ne koriste u enum cesto
    //taj code se mora dodeliti svakoj konstanti
    public String code;//ako stavimo da je polje privatno moramo napraviti
    // i get metodu pomocu koje cemo citati vrednost polja

    //konstruktor enumeracije koji se kreira zbog dodatnih svojstava
    //samo u slucaju da kreiramo dodatna svojstva tj polja
    Size(String code) {
        this.code = code;
    }
}
