/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js.pkg06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * Created by 21343002_Aini Rizkina
 */
public class NilaiA {
    public static void main(String[] args) {
        BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
        
        String a,b,c;
        float nilai1,nilai2,nilai3, average;
        
        try {
            System.out.print("Masukan nilai 1:");
            a = nilai.readLine();
            nilai1 = Float.parseFloat(a);
            
            System.out.print("Masukan nilai 2:");
            b = nilai.readLine();
            nilai2 = Float.parseFloat(b);
            
            System.out.print("Masukan nilai 3:");
            c = nilai.readLine();
            nilai3 = Float.parseFloat(c);
           
            average = (nilai1 + nilai2 + nilai3)/3;
            
            if(average>=60){
                System.out.println("Average: "+ average + " :-) ");
            }
            else 
                System.out.println("Average: "+ average + " :-( ");
             }
            catch (IOException e){
                System.out.println("Gagal membaca keybboard");
            }    
    }
    
}
