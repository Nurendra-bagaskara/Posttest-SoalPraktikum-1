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
public class Lingkaran {
// deklarasi variabel
    double phi = 3.14;
    double r,hasil;

    void hitung() {
        Scanner input = new Scanner(System.in);
        //input nilai r
        System.out.println("Masukan Nilai Jari-jari Lingkaran");
        System.out.print("Nilai Jari-jari\t\t:");
        r=input.nextInt();
        //poses hitung
        hasil = phi*r*r;
        //hasil penghitungan
        System.out.println("Luas Lingkaran Adalah\t:"+hasil);
        
        
    }
}
