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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Proses input data dan output
        Scanner input = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("Selamat Datang Diprogram Penghitungan Luas");
        System.out.println("1.Luas Lingkaran\n2.Luas Persegi");
        System.out.println("==========================================");
        System.out.println("Masukan angka pilihan untuk proses hitung");
        System.out.print("Angka pilihan Anda\t:");
        int pilihan = input.nextInt();
        //percabangan
        switch (pilihan) {
            case 1:
                System.out.println();
                System.out.println("<<<Silahkan Isi Sesuai Perintah>>>");
                Lingkaran masuk = new Lingkaran();
                masuk.hitung();
                break;
            case 2:
                System.out.println();
                System.out.println("<<<Silahkan Isi Sesuai Perintah>>>");
                Persegi isi = new Persegi();
                isi.hitung();
                break;
        }

    }

}
