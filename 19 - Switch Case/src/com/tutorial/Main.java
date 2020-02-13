package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        - Switch Case = secara global hampir mirip dengan if else, tapi pengunaannya lebih terbatas.
        - Sintaks:
            switch(variabel / ekspresi){
                case nilai1:
                    // ststement
                    break;
                case nilai2:
                    // statement
                    break;
                . . . .  . .
                 . . . . . .
                default:
                // statement
             }
          - Catra Kerja:
              - pernyataan/ekspersi switch di evaluasi sekali.
              - nilai ekspresi dibandingkan dengan nilai masing-masing case.
              - jika ada kecocokan maka statement yang terkait dijalankan.
              - bila terdapat kay break; maka pernyataan akan di akhiri.
              - jika semua nilai ekspresi tidak ada yang cocok dengan nilai masing-masing case, key default; dan statementnya
                akan di jalanka
              - kata kunci break dan default bersifat opsional.

           NB: - Pernyataan switch case pada java hanya berlaku pada:
                    - Tipe data primitif: byte, short, char, int.
                    - Jenis yang disebut dengan (java enums)
                    - class String
                    - beberapa class yang membungkus tipe data primitif: Carrakter, Byte, Short, dan Integer.
         */

        // Contoh 1: Mengambil hari sesuai input user.
        int int_input;
        String hari;

        Scanner user_input = new Scanner(System.in);
        System.out.print("Maukan angka 1 - 7 = ");
        int_input = user_input.nextInt();

        switch (int_input){
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "kamis";
                break;
            case 5:
                hari = "Jum'at";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                hari ="Input yang anda masukan tidak sesuai perintah!";
        }
        System.out.println(int_input + " = " + hari);


        // ==========> MEMBUAT KALKULATOR SEDERHANA DENGAN SWITCH CASE <==========

        System.out.println("\n\nSelamat Detang Di kalkulator Sederhana Kami\n");
        char operator;
        double a, b, hasil;
        System.out.print("Masukan angka pertama = ");
        a = user_input.nextDouble();
        System.out.print("Masukan angka kedua = ");
        b = user_input.nextDouble();
        System.out.print("Masukan operator( +, -, *, atau / ) = ");
        operator = user_input.next().charAt(0);

        switch (operator){
            case '+':
                hasil = a + b;
                System.out.println(a + " + " + b + " = " + hasil);
                break;
            case '-':
                hasil = a - b;
                System.out.println(a + " - " + b + " = " + hasil);
                break;
            case '*':
                hasil = a * b;
                System.out.println(a + " x " + b + " = " + hasil);
                break;
            case '/':
                hasil = a / b;
                System.out.println(a + " : " + b + " = " + hasil);
                break;
            default:
                System.out.println("Operator yang anda masukan tidak sesuai!");
                break;
        }

    }
}
