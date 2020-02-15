package com.tutorial;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        /*
        - do while = konsepnya sama seperti while loop tapi kali ini kode dijalankan dulu baru ekspresi di cek.
         */

        System.out.println("=====> Do While <=====");
        Scanner input = new Scanner(System.in);
        int a,b,hasil,jawaban,salah;
        a = 7;
        b = 9;
        salah = -1;
        hasil = a * b;

        do {
            System.out.print("hasil dari " + a + " x " + b + " = ");
            jawaban = input.nextInt();
            salah += 1;
        } while (jawaban != hasil);
        System.out.println("Jawaban adalah " + hasil + ", anda salah " + salah + " kali");
    }
}
