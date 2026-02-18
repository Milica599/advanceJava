package com.modul_advance_java.moduliGradivo.modul4.fajloviIFolderi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class JavaProgram {
    static void main(String[] args) {
        //niz root objekata, prikaz korenskih foldera
        File[] roots = File.listRoots();
        for (File root : roots) {
            System.out.println(root);
        }

        //da bismo kreirali objekat fajl prosledjujemo putanju do tog fajla
        //relativne i apsolutne putanje
        File myFile = new File("Desktop\\deca-i-sport.jpg");

        /*
        getName() – služi za dobijanje imena fajla;
        getParent() – čita naziv foldera unutar koga se nalazi konkretni fajl/folder;
        getAbsolutePath() – vraća apsolutnu putanju do fajla;
        getPath() – vraća putanju u onom obliku u kome je definisana prilikom kreiranja objekta File tipa;
        isAbsolute() – utvrđuje da li je definisana putanja apsolutna ili ne.
         */

        System.out.println("Absolute path = " + myFile.getAbsolutePath());
        System.out.println("Name = " + myFile.getName());
        System.out.println("Parent = " + myFile.getParent());
        System.out.println("Path = " + myFile.getPath());
        System.out.println("Is absolute = " + myFile.isAbsolute());

        File file = new File("C:\\Projekat\\Projekat\\AdvanceJava\\advanceJava\\Desktop\\deca-i-sport.jpg");
        //provera da li fajl postoji na sistemu
        if (file.exists()) {
            System.out.println("Is file = " + file.isFile());
            System.out.println("Is directory = " + file.isDirectory());
            System.out.println("Lenght = " + file.length());
            //kada je fajl poslednji put odifikovan
            Instant instant = Instant.ofEpochMilli(file.lastModified());
            LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd. MMMM yyyy. HH:mm:ss");
            System.out.println("Last modified = " + dateTime.format(dateTimeFormatter));
        } else {
            System.out.println("File/folder does not exist.");
        }

        //citanje sadrzaja foldera
        File path = new File("C:\\");
        //da li putanja postoji
        //da li je folder
        if (path.exists() && path.isDirectory()) {
            //niz podfoldera list()
            String[] strings = path.list();
            if (strings != null) {
                //prikaz pod foldera i fajlova
                for (String string : strings) {
                    System.out.println(string);
                }
            }
        }

        //identicno ali fajl objekte
        //mozemo dobiti fajl informacije
        if (path.exists() && path.isDirectory()) {
            File[] files = path.listFiles();

            if (files != null) {
                for (File file1 : files) {
                    System.out.println(file1.getName());
                }
            }
        }

        //kreiranje foldera
        File testFolder = new File("C:\\test");
        if (!testFolder.exists()) {
            //mkdir kreira folder
            boolean success = testFolder.mkdir();
            if (success) {
                System.out.println("Folder created: " + testFolder.getName());
            } else {
                System.out.println("Folder is not created.");

            }
        } else {
            System.out.println("Folder " + testFolder.getName() + " already exists.");
        }

        //brise folder test
        if (testFolder.exists()) {
            //mkdir kreira folder
            boolean success = testFolder.delete();
            if (success) {
                System.out.println("Folder deleted: " + testFolder.getName());
            } else {
                System.out.println("Folder is not deleted.");

            }
        } else {
            System.out.println("Folder " + testFolder.getName() + " already deleted.");
        }

        //promena naziva fajl
        //da bi videli stvarnu logiku fajl mora da postoji oldfile
        File oldFile = new File("C:\\java_practice\\old_name.txt");
        File newFile = new File("C:\\java_practice\\new_name.txt");
        if (!oldFile.exists()) {
            System.out.println("File doesn't exist!");
            return;
        }
        if (newFile.exists()) {
            System.out.println("File with desired name already exists!");
            return;
        }
        if (oldFile.renameTo(newFile)) {
            System.out.println("Rename successful");
        } else {
            System.out.println("Rename failed");
        }


        //kopiranje fajla
        File aFile = new File("C:\\java_practice\\text.txt");
        File bFile = new File("C:\\java_practice\\test\\text.txt");
        try (FileInputStream inStream = new FileInputStream(aFile);
             FileOutputStream outStream = new FileOutputStream(bFile)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successfully!");
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

        //kopiranje pomocu elemenata nio paketa
        Path source = Paths.get("C:\\java_practice\\text.txt");
        Path destination = Paths.get("C:\\java_practice\\test\\text.txt");
        try {
            if (!Files.exists(source)) {
                System.out.println("File doesn't exist!");
                return;
            }
            if (!Files.exists(destination.getParent())) {
                System.out.println("Location doesn't exist!");
                return;
            }
            if (Files.exists(destination)) {
                System.out.println("File already exists on the location!");
                return;
            }
            Files.copy(source, destination);
            System.out.println("File " + source.getFileName() + " is copied!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
