package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // Program untuk konversi data

        int nilaiInt = 256; //32bit
        System.out.println("nilai integer = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar

        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        // Megkonversi rentang ke tipe data yang lebih kecil

        byte nilaiByte =(byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // NB : sehingga ketika mengkonversikan tipe data ke tipe data yang lebih kecil.
        //      jika tipe data sudah mencapai nilai max dari tipe data yang dikonversikan
        //      maka nilai nya akan memutar ke nili min dari tipe data yang dikonversikan

        //Casting Pembagian

        int a = 10;
        int b = 4;
        int c = a/b;
        System.out.printf("%d / %d = %d\n ", a,b,c);

        // Hasilnya tidak sesuai dengan pembagian
        // Sehingga memerlukan konversi tipe data


        // Ada 2 cara:

        // 1 -
        float d = 10;
        int e = 4;
        float f = d/e;
        System.out.printf("%f / %d = %f\n",d,e,f);

        // NB : Konversi bisa dilakukan dengan mengganti dan menyamakan salah tipe data yang akan dibagi dengan tipe data hasil.

        //2 -
        int x = 10;
        int y = 4;
        float z = (float)x / y;
        System.out.printf("%d / %d = %f \n",x,y,z);

        // NB : Konsepnya sama dengan mempersempt rentang konversi tipe data.
    }
}
