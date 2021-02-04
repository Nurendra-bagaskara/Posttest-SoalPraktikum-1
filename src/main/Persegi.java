/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Persegi {
    // Deklarasi variabel
    int s,hasil;
    
    void hitung(){
     Scanner input = new Scanner(System.in);
        //input nilai s
        System.out.println("Masukan Nilai Sisi Persegi");
        System.out.print("Nilai sisi\t\t:");
        s=input.nextInt();
        //poses hitung
        hasil = s*s;
        //hasil penghitungan
        System.out.println("Luas Persegi Adalah\t:"+hasil);
        
    }
}
