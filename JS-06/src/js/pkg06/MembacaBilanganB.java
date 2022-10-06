/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js.pkg06;

import java.util.Scanner;


/**
 *
 * Created by 21343002_Aini Rizkina
 */
public class MembacaBilanganB {
    public static void main(String[] args) {
        int angka;
        
        Scanner angkaMasuk = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        angka = angkaMasuk.nextInt();
        
        switch (angka) {
            case 1:
                System.out.println("SATU");
                break;
            case 2:
                System.out.println("DUA");
                break;
            case 3:
                System.out.println("TIGA");
                break;
            case 4:
                System.out.println("EMPAT");
                break;
            case 5:
                System.out.println("LIMA");
                break;
            case 6:
                System.out.println("ENAM");
                break;
            case 7:
                System.out.println("TUJUH");
                break;
            case 8:
                System.out.println("DELAPAN");
                break;
            case 9:
                System.out.println("SEMBILAN");
                break;
            case 10:
                System.out.println("SEPULUH");
                break;
            default:
                System.out.println("Invalid number.");
        }
    } 
}
