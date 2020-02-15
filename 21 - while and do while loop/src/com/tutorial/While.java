package com.tutorial;
import java.util.Scanner;

public class While {
    public static void main(String[] args){
        /*
        - While Loop: konsepnya mirip dengan for loop, cuma sintaksnya yang berbeda.
        - sintaksnya:
            while(ekspresi){
                //code blok
            }
         */
        Scanner input = new Scanner(System.in);
        System.out.println("=====> While Loop <=====");
        System.out.println("=====> Contoh 1 -> Menampilkan angka sesuai input <=====");
        int a, n, i, b;
        System.out.print("Masukan angka: ");
        a = input.nextInt();
        n = 1;
        i = 1;
//        hasil = 0;
        while (n <= a){
            System.out.println("angka ke - " + n);
            n++;
        }

        System.out.println("\n====> Contoh 2 -> faktorial <=====");
        System.out.print("Masukan angka: ");
        b= input.nextInt();
        int hasil = b;

        while (b > i){
            hasil = hasil * (b - i);
            i++;
        }
        System.out.println("hasil faktorial " + b + " = " + hasil);

        int sum = 0, c = 100;

        while (c != 0) {
            sum += c;     // sum = sum + i;
            --c;
        }

        System.out.println("Sum = " + sum);
    }
}
