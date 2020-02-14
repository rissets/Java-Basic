package com.tutorial;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        /*
        - Loop digunakan dalam pemrograman untuk mengulangi blok kode tertentu
          sampai kondisi tertentu terpenuhi (ekspresi tes adalah false).

         - sintaksnya:
            for(inisialisasi; tes ekspresions; perubahan){
                // code blok
            }

         - cara kerja:
            - Ekspresi inisialisasi dijalankan hanya sekali.
            - Kemudian, ekspresi tes dievaluasi. Di sini, tes ekspresi adalah ekspresi boolean.
            - Jika ekspresi tes dievaluasi ke true,
                - Kode di dalam tubuh forloop dieksekusi.
                - Kemudian ekspresi pembaruan dijalankan.
                - Sekali lagi, ekspresi tes dievaluasi.
                - Jika ekspresi pengujian adalah true, kode di dalam tubuh forloop dieksekusi dan pembaruan ekspresi dieksekusi.
            - Proses ini berlangsung hingga ekspresi tes dievaluasi false.
            - Jika ekspresi tes dievaluasi false, forloop berakhir.
         */

        // Contoh 1
        System.out.println("=====> For Loop 1<=====");
        for (int i = 0; i <= 10; ++i){
            System.out.println("Baris ke- " + i);
        }

        // Contoh 2
        System.out.println("=====> For Loop 2 <=====");
        Scanner input = new Scanner(System.in);
        int b,c,d,hasil;
        d = 0;
        b = 2;
        System.out.print("Masukan angka = ");
        c = input.nextInt();
        System.out.println(b + " x " + c + " = ");
        hasil = (b * c);
        for (int i = 2; i <= hasil; ++i){
            System.out.println(b + " + " + d++ + " = " + i);
        }
        System.out.println("Hasil dari " + b + " x " + c + " = " + hasil);

    }
}
