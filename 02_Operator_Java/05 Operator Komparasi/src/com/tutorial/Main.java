package com.tutorial;

public class Main {
    public static void main(String[] args) {
    /*
    - Operator Komporasi adalah operator yang membandingkan dua nilai dan menghasilkan nilai boolean (true / false)
    - Macam-macam operator komporasi:
        - equal/sama dengan (==)
        - not equal/tidak sama dengan (!=)
        - less than/lebih kecil (<) ---> ketika nilainya sama maka hasilnya false, karena mencari yang lebih kecil
        - greater than/lebih besar (>) ---> ketika nilainya sama maka hasilnya false, karena mencari yang lebih besar
        - less than equal/lebih kecil sama dengan (<=)  ---> ketika sama, menghasilkan true
        - greater than equal/lebih besar sama dengan (>=) ---> ketika sama, menghasilkan true
     */

        int a = 10;
        int b = 10;
        boolean hasil;

        // equal/sama dengan (==)
        System.out.println("----Equal(Sama Dengan)");
        hasil = (a == b);
        System.out.printf("%d == %d --> %s\n",a,b,hasil);

        // not equal/tidak sama dengan (!=)
        System.out.println("\n----Not Equal (Tidak Sama Dengan)");
        hasil = (a != b);
        System.out.printf("%d != %d --> %s\n",a,b,hasil);

        // less than/lebih kecil (<)
        System.out.println("\n----Less Than (Kurang Dari)");
        hasil = (a < b);
        System.out.printf("%d < %d --> %s\n",a,b,hasil);

        // greater than/lebih dari (>)
        System.out.println("\n----Greater Than (Lebih Dari)");
        hasil = (a > b);
        System.out.printf("%d > %d --> %s\n",a,b,hasil);

        // less than equal/kurang dari sama dengan (<=)
        System.out.println("\n----Less Than Equal (Kurang Dari Sama Dengan)");
        hasil = (a <= b);
        System.out.printf("%d <= %d --> %s\n",a,b,hasil);

        // greater than equal/lebih dari sama dengan (>=)
        System.out.println("\n----Greater Than Equal (Lebih Dari Sama Dengan)");
        hasil = (a >= b);
        System.out.printf("%d >= %d --> %s\n",a,b,hasil);

    }

}
