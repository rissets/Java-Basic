package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner user_input = new Scanner(System.in);
        int panjang, lebar, tinggi, luas, volume;

        System.out.println("-----> Menghitung Volume <-----");
        System.out.print("Masukan Panjang = ");
        panjang = user_input.nextInt();

        System.out.print("Masukan Lebar = ");
        lebar = user_input.nextInt();

        System.out.print("Masukan Tinggi = ");
        tinggi = user_input.nextInt();

        System.out.println("Luas = Panjang x Lebar");
        System.out.println("Luas = " + panjang + " x " + lebar);

        luas = panjang * lebar;

        System.out.println("Luas = " + luas);

        System.out.println("Volume = Tinggi x Luas");
        System.out.println("Volume = " + tinggi + " x " + luas);

        volume = tinggi * luas;

        System.out.println("Volume = " + volume);

    }
}
