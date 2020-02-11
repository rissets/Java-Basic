package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        - If Statment / Pengondisian = untuk pengondisian dalam program
        - Sintaksnya:
            if (kondisi 1){
                statment 1
            } else if (kondisi 2){
                statement 2
            } else {
                statement 3
            }

            NB: Jika kondisi 1 bernilai True maka statement 1 akan di jalankan, dan kondisi 2 seterusnya akan dilewati.
                jika False, akan mengecek kondisi 2, jika True, statement 2 akan dijalankan.
                jika kondisi 2 bernilai False, maka akan menjalankan statement 3.
        */
        int a, b, hasil, jawaban, a1;
        Scanner input_user = new Scanner(System.in);

        // ------> If Else Statement sederhana <------

        System.out.println("\n==== Perkalian Menggunakan IF Else Statement ====\n");
        a = 10;
        b = 5;
        hasil = a * b;
        System.out.print("hasil dari " + a + " x " + b + " = ");
        jawaban = input_user.nextInt();
        if (hasil == jawaban){
            System.out.println("Jawaban anda benar!");
        } else {
            System.out.println("Jawaban anda salah!");
        }


        // ------> If Else if Else Statement <------

        System.out.println("\n==== Aplikasi pengurutan angka ====\n");
        System.out.print("Masukan angka yang lebih kecil dari 3 = ");
        a1 = input_user.nextInt();

        if ( a1 == 2){
            System.out.println("Jawaban anda benar!");
        } else if (a1 == 1){
            System.out.println("Jawaban anda hampir benar!");
        } else {
            System.out.println("Jawaban anda salah");
        }

        // ------> Nested If (If bersarang/if didalam if) <------
        boolean n;
        int x, y, total, jum;
        x = 25;
        y = 10;
        total = x * y;
        System.out.println("\n==== Kuis menggunakan nested if ====\n");
        System.out.print("Maukah anda menjawab kuis (true/false) = ");
        n = input_user.nextBoolean();
        if (n == true){
            System.out.println("\nJawablah Perntanyaan dibawah ini.");
            System.out.print("\nHasil dari " + x + " x " + y + " = ");
            jum = input_user.nextInt();
            if (total == jum){
                System.out.println("\nJawaban anda benar!");
                System.out.println("Selamat anda telah mengikuti kuis dari kami :). Jangan lupa pajak ditanggung pemenang");
            } else {
                System.out.println("\njawaban anda salah!");
                System.out.println("Anda tidak bisa mendapatkan hadiah. Selamat Mencoba Kembali :)");
            }
        } else {
            System.out.println("\nAnda tidak akan mendapatkan hadiah, karena anda tidak mau mengikuti kuis kami");
        }
    }
}
