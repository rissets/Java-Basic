package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        - Array adalah: - wadah yang menampung data (nilai) dari satu jenis tunggal.
                          Misalnya, Anda bisa membuat larik yang bisa menampung 100 nilai tipe int.

                        - konstruk fundamental di java yang memungkinkan Anda menyimpan dan mengakses sejumlah besar nilai dengan mudah.

        - Deklarasi Array: tipedata[] nama;

         */

        // deklarasi
        int[] angka;
        angka = new int[5];

        // deklarasi dan inisialisasi
        String[] buah = {"Apel", "Durian", "Mangga", "Pisang", "anggur"};

        // mengakses array

        angka[2] = 32;

        angka[3] = 15;

        for (int i = 0; i < 5; i++){
            System.out.println("Indek ke-" + i + " = " + angka[i]);
        }

        for (int i = 0; i < 5; i++){
            System.out.println("Buah: " + buah[i]);
        }

        // Contoh Array Menghitung jumlah rata-rata nilai yang di inputkan oleh user
        System.out.println("\n=====> Menghitung rata-rata <=====");
        Scanner input = new Scanner(System.in);

        int[] nilai;
        nilai = new int[5];
        System.out.println("masukan 5 angka untuk menghitung rata-ratanya:");

        // mengambil input dari user
        for (int i = 0; i < 5; i++){
            System.out.print(i + " = ");
            nilai[i] = input.nextInt();
        }

        int jumlah = 0;
        double rata;

        // for-each
        for (int n: nilai){
            jumlah += n;
        }

        // mengambil panjang nilai
        int p_array = nilai.length;

        // menghitung rata-rata
        rata = ((double)jumlah / (double)p_array);

        System.out.print("Nilai yang di inputkan: ");
        for (int i = 0; i < 5; i++){
            System.out.print(nilai[i] + "  ");
        }

        System.out.println("\nJumlah = " + jumlah);
        System.out.println("Rata-rata = " + rata);

    }
}
