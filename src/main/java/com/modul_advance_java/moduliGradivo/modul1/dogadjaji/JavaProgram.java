package com.modul_advance_java.moduliGradivo.modul1.dogadjaji;

//ovde vrsimo pretplatu na dogadjaj
public class JavaProgram implements AlarmListener {
    static void main(String[] args) {
        //ovo su nasi  potencijalni slusaoci- instance glavnog programa
        JavaProgram javaProgram = new JavaProgram();
        JavaProgram javaProgram1 = new JavaProgram();
        JavaProgram javaProgram2 = new JavaProgram();

        //alarm je izvor tj generator dogadjaja
        Alarm alarm = new Alarm();
        //istance javaProgram-a yvanicno postaju slusaoci dogadjaja
        alarm.addListener(javaProgram);
        alarm.addListener(javaProgram1);
        alarm.addListener(javaProgram2);
        //aktivira se glavna logika
        //za sve slusaoce ce ispisati wake up nakon dve sekunde

        //brisemo slusaoca
        alarm.removeListener(javaProgram1);
        //dodajemo slusaoca kog smo prethodno obrisali
        //mogli smo i potpuno novog slusaoca da kreiramo pa da njega dodamo
        alarm.addListener(javaProgram1);
        alarm.setTimeFromNow(2000);

    }

    @Override
    public void alarmRang(AlarmEvent alarmEvent) {
        //poruku o dogadjajudjaju - to je time up
        //dogadjaj je u varijabli eventobj
        System.out.println(alarmEvent.message);
        System.out.println(" Wake up!!!");
    }
}
