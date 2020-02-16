package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
         - break = untuk mengakhiri proses looping.
         - continue = untuk melompati prosses looping.
         */

        // Contoh Break 1
        System.out.println("=====> Break 1 <=====");
        for (int i = 0; i <= 10; i++){
            if (i == 5){
                System.out.println("angka: " + i + " looping berakhir");
                break;
            }
            System.out.println("angka: " + i);
        }

        // Contoh Break 2
        System.out.println("\n====> Breaak 2 <=====");
        Scanner input = new Scanner(System.in);
//        int a,b,hasil,jawaban,salah;
//        char tebakan;
//        a = 5;
//        b = 7;
//        hasil = a*b;
//        salah = 0;
//
//        System.out.print("Mau menjawab pertanyaan (y/n): ");
//        tebakan = input.next().charAt(0);
//
//        if (tebakan == 'y'){
//            while(true){
//                System.out.print(a + " x " + b + " = ");
//                jawaban = input.nextInt();
//                if (jawaban == hasil){
//                    System.out.println("Jawaban yang benar adalah " + hasil + ". Anda salah " + salah + " kali.");
//                    break;
//                } else{
//                    salah++;
//                }
//            }
//        } else if (tebakan == 'n'){
//            System.out.println("Terima kasih atas tanggapan anda!");
//        } else {
//            System.out.println("Input yang anda masukan tidak sesuai!");
//        }


        // Contoh Continue 1
        System.out.println("\n=====> Continue <=====");
        for (int i = 1; i <= 10; i++){
            if (i == 5){
                System.out.println("ketika i = " + i + " looping akan dilompati");
                continue;
            }
            System.out.println("Sekarang looping di angka: " + i);
        }

        // Contoh Continue dan Break
        System.out.println("\n====> Continue && Break <=====");
        int n1 = 3, n2 = 5, h, s = 3, j;
        h = n1 * n2;
        while(true){
            System.out.print(n1 + " x " + n2 +" = ");
            j = input.nextInt();
            if (j == h){
                System.out.println("Jawaban anda benar!");
                break;
            } else if (s == 1){
                System.out.println("Anda bodoh sekali, sudah melakukan 3 kali kesalahan");
                break;
            } else {
                System.out.println("jawaban anda salah!");
                --s;
                continue;
            }

        }

    }
}
