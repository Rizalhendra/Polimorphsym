/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.polimorphysm;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
       
        Phone Realme1 = new Realme();

      
        PhoneUser Rizal = new PhoneUser(Realme1);

     
            Rizal.turnOnThePhone();
        
        
        Scanner input = new Scanner(System.in);
        String aksi; 

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Power On HP");
            System.out.println("[2] Power Off HP");
            System.out.println("[3] Tambah Volume");
            System.out.println("[4] Kuranggi Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                    Rizal.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                    Rizal.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                    Rizal.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                    Rizal.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("ERORRR! ");
            }
        }

    }

}
