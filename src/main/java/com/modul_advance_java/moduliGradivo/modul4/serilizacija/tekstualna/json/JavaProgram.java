package com.modul_advance_java.moduliGradivo.modul4.serilizacija.tekstualna.json;
/*
JSON je jednostavan, jezički nezavisan tekstualni format za razmenu podataka.
JSON je namenjen serijalizaciji strukturiranih podataka.
To praktično znači da JSON omogućava da se podaci koji su tokom izvršavanja programa predstavljani
korišćenjem oblika koji su tipični za većinu programskih jezika (objekti, nizovi, liste...)
 na veoma lak način pretvore u tekstualni oblik i na taj način podele.
Java programski jezik ne poseduje ugrađenu implementaciju za obavljanje JSON serijalizacije
i deserijalizacije. Srećom, postoji veliki broj eksternih biblioteka koje su
 namenjene obavljanju takvog posla. Mi ćemo u ovoj lekciji koristiti takvu biblioteku kompanije Google, koja se zove Gson.
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.modul_advance_java.moduliGradivo.modul4.serilizacija.tekstualna.xml.Car;


//file+projectstructure+modules
public class JavaProgram {
    static void main(String[] args) {
        Car car = new Car();
        car.setId(10);
        car.setModel("Audi A8");
        car.setMaximumSpeed(270.00);

        //gson objekat
        //serilizacija toJson
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String jsonCar = gson.toJson(car);
        System.out.print(jsonCar);

        //deserilizacija
        builder = new GsonBuilder();
        //lep prikaz serPrettyPrinting
        builder.setPrettyPrinting();
        gson = builder.create();
        jsonCar = gson.toJson(car);
        System.out.print(jsonCar);

    }
}
