package com.modul_advance_java.moduliGradivo.modul2.enumeracije;

public class JavaProgram {
    static void main(String[] args) {
        //kreirali smo objekat tipa Size
        //vrednost tog objekta je jedna nasa konstanta
        //u pozadini se kreirala klasa Size koja je nasledila baznu
        // tj osnovnu klasu enumeracija - Enum
        //a ta enum klasa je specijalizovana Size enumeracijom tj enum objektom
        //vrednost objekta tipa Size(enumeracije) je konstanta LARGE
        Size size = Size.LARGE;

        //nacin da dojdemo do svih konstanti
        //values() metoda je staticka metoda i ona vraca sve konstante
        //length nam vraca duyinu niza
        for (int i = 0; i < Size.values().length; i++) {
            //ispisujemo u konzolu jednu po jednu konstantu
            //tako sto pristupamo vrednostima preko index-a (ovaj put je to i)
            System.out.println(Size.values()[i]);
        }

        //dokaz da ih mozemo koristiti i za oducivanje o toku rada programa
        //enumeracije mozemo da koristimo kao kontrolne vrednosti(proveravamo uslove npr ==)
        //mozemo da poreddimo sa == jer se porede reference a ako objekat ima istu referencu
        // onda ima i isti hashCode()
        //zakljucak je da ima istu i vrednost

        if (size == Size.SMALL) {
            System.out.println("Your size is s");
        } else if (size == Size.MEDIUM) {
            System.out.println("Your size is m");
        } else if (size == Size.LARGE) {
            System.out.println("Your size is l");
        } else {
            System.out.println("Your size is xl");
        }

        //jos jedan nacin za kombinovanje enumeracija i kontroletoka je u switchu
        //ponovo enumeraciju koristimo kao kontrolnu vrednost
        // znak -> je lambda
        switch (size) {
            case SMALL -> System.out.println("You size is S");
            case MEDIUM -> System.out.println("You size is M");
            case LARGE -> System.out.println("You size is L");
            case EXTRA_LARGE -> System.out.println("You size is XL");
        }

        //valueOf() je metoda koja dojde do naziva konstante ako mi znamo njenu vrednost
        //vrednost je small,medeium,large
        //korisna kada podaci pristizu u aplikaciju tj program u tekstualnom obliku
        //staticka metoda kojom se pronalazi konstanta
        //ako unesemo nesto sto ne postoji javi se izuyetak
        //ako se izvrsi catch blok to ynaci da size1 ima vrednost null
        //ovaj unspecified oponasa size1 = null;
        Size size1 = Size.UNSPECIFIED;
        try {
            //pronalazi konstantu sa tom vrednoscu
            size1 = Size.valueOf("LARGE");

        } catch (IllegalArgumentException e) {
            //ispisujemo poruku o izuyetku
            //umesto sout + e.getmessage je bolje e.printStackTrace();
            System.out.println(e.getMessage());
        }
        //dokaz za kod u try catch
        //pomocu toString metode koja se pozvala u pozadini pristupili smo svojstvu enumeracije (svojstvo name)
        System.out.println(size1);
        //ordinal() metoda pristupa svojstvu ordinal tj rednom broju konstante
        //ordinal broji od 0
        System.out.println(size1.ordinal());

        //za svako konstantu iz enumeracije Size ispisace se njeno ime i redni broj
        for (int i = 0; i < Size.values().length; i++) {
            //sa ordinal() ispisujemo redni broj
            //sa values()[i] pristupama name zbog System.out.println i toString u pozadini
            //sa values()[i].code pristupamo code svojstvu
            //ako je nase polje code private vidljivosti morali smo mu definisati get metodu
            //sa get values()[i].getCode()  isto sto i sad sa .code
            //.code ako je polje public
            //.getCode() ako je polje private vidljivosti
            System.out.println(size.ordinal() + ": " + size + ", " + Size.values()[i] +
                    Size.values()[i].code);
        }
    }
}
