package com.tutorial;

public class Main {
    public static void main(String[] args) {
        /*
         Dalam java dimungkinkan membuat array multidimensi baik 2 dimensi ataupun tiga dimensi.
         - Array 2 dimensi
            int a [][] = new int [3][4] --> 3 baris 4 kolom, (3 x 4). artinya int a mampu menampung max 16 element.

         - Array 3 dimensi
            int b [][][] = new int [2][3][4] --> (2 x 3 x 4). int b mampu menampung max 24 element.
         */

        // Inisialisasi Array 2 Dimensi

        int [][] a = {
                {1,2,3},
                {4,5,6,7},
                {8,9}
        }; // disini array dua dimensi a memiliki panjang yang berbeda-beda.
        System.out.println("Panjang baris ke-1: " + a[0].length); // --> 3
        System.out.println("Panjang baris ke-2: " + a[1].length); // --> 4
        System.out.println("Panjang baris ke-3: " + a[2].length); // --> 2

        // Menampilkan array 2 dimensi dengan for
        System.out.println("\n===> Menampilkan array 2 dimensi dengan for <===");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.println("[" + i + "] [" + j + "] = " + a[i][j]);
            }
        }

        // Menampilkan array 2 dimensi dengan for-each (rekomendasi)
        System.out.println("\n===> Menampilkan array 2 dimensi dengan for-each <===");
        for ( int[] a1: a){
            for (int data: a1){
                System.out.println("["+ a1.length + "] = " + data);
            }
        }


        // Inisialisasi Array 3 Dimensi
        int [][][] b = {
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                },
                {
                        {10,11},
                        {12,13},
                        {14,15}
                }
        };

        System.out.println("Panjang dari b: " + b.length);

        System.out.println("Panjang dari b 2D (1): " + b[0].length);
        System.out.println("Panjang dari b 2D (1) 1D [1]: " + b[0][0].length);
        System.out.println("Panjang dari b 2D (1) 1D [2]: " + b[0][1].length);
        System.out.println("Panjang dari b 2D (1) 1D [3]: " + b[0][2].length);

        System.out.println("Panjang dari b 2D (2): " + b[1].length);
        System.out.println("Panjang dari b 2D (2) 1D [1]: " + b[1][0].length);
        System.out.println("Panjang dari b 2D (2) 1D [2]: " + b[1][1].length);
        System.out.println("Panjang dari b 2D (2) 1D [2]: " + b[1][2].length);

        // Menampilkan array 3 dimensi dengan for
        System.out.println("\n===> Array 3D For <===");
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                for (int k = 0; k < b[i][j].length; k++){
                    System.out.println("["+i+"] ["+j+"] ["+k+"] = " + b[i][j][k]);
                }
            }
        }

        // Menampilkan array 3 dimensi dengan for-each
        System.out.println("\n===> Array 3D For-each <===");
        for (int[][] d2: b){
            System.out.println("Panjang D3: " + b.length);
            for (int[] d1: d2){
                System.out.println("Panjang D2: " + d1.length);
                for (int data: d1){
                    System.out.println("Data D1: " + data);
                }
            }
        }
    }
}
