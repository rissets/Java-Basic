package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // Unary : operasi yang dilakukan pada satu variable

        // Unary + dan -
        int angka = 5;
        System.out.printf("unary '+', %d menjadi %d\n", angka, +angka);
        System.out.printf("unary '+', %d menjadi %d\n", angka, -angka);

        // Unary decrement dan increment

        // Prefix : operasi akan dilakukan dulu kemudian nilainya ditampilkan
        // ++a
        int angka2 = 10;
        System.out.printf("unary '++' prefix %d menjadi %d\n", angka2, ++angka2);
        int angka3 = 10;
        System.out.printf("unary '++' prefix %d menjadi %d\n", angka3, --angka3);

        // Postfix : nilai akan ditampilkan dulu kemudian operasi dilakukan
        // a++
        int angka4 = 20;
        System.out.printf("unary '++' postfix %d menjadi %d\n", angka4, angka4++);
        System.out.printf("setelah dilakukan postfix menjadi %d\n", angka4);

        // a--
        int angka5 = 20;
        System.out.printf("unary '--' postfix %d menjadi %d\n", angka5, angka5--);
        System.out.printf("setelah dilakukan postfix menjadi %d\n", angka5);

        // Unari ! (Negasi) : operasi untuk boolean
        boolean sayang = true;
        System.out.println("unary '!' (Negasi) " + sayang + " menjadi " + !sayang);
    }
}
