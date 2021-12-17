package com.company;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        int bajt;
        try (FileInputStream fls = new FileInputStream("Czw9.3.txt");
             FileOutputStream fos = new FileOutputStream("zapisany.txt")) {
            do {
                bajt = fls.read();
                if((char) bajt == ' ') bajt = '-';
                if (bajt != -1) fos.write(bajt);
            } while (bajt != -1);
        } catch (IOException e){
            System.out.println("Blad odczytu");
        }

    }
}
