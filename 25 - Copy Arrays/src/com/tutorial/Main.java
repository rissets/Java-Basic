package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ===> Menyalin Array Menggunakan Operator Penugasan (Ini tidak menciptakan object baru) <===
        System.out.println("==> Menyalin Array Dengan Operator Penugasan <==");
        int[]  angka = {1,3,5,6,7};
        int[] angkaPositif = angka;

        for (int n: angkaPositif){
            System.out.print(n + "\t");
        }

        // Jika kita mengubah element angka, element angkaPositif juga akan berubah.
        System.out.println("\n");
        angka[0] = -1;
        for (int i: angkaPositif) {
            System.out.print(i + "\t");
        } // hal ini disebut "shallo copy". teknik copy ini tidak menciptakan object baru.


        // ===> Menyalin Array Menggunakan Looping Construct <===
        System.out.println("\n\n==> Menyalin Arraay Dengan Looping Construct <==");
        int[] asal = {1,2,3,4,5,6};
        int[] tujuan = new int [6];

        for (int i = 0; i < asal.length; i++) {
            tujuan[i] = asal[i];
        }
        System.out.println(Arrays.toString(tujuan));
        // Teknik ini akan menciptakan object baru, artinya jika element salah satu dari asal atau tujuan di ubah,
        // tidak akan mempengaruhi array yang lain(yang tidak diubah).
        // Method toString () digunakan untuk mengubah array menjadi string (hanya untuk tujuan keluaran).


        // ===> Menyalin Array Dengan Method arraycopy() <===
        System.out.println("\n==> Menyalin Array Dengan Method arraycopy() <==");
        /*
         - sintaksnya: System.arraycopy(array_yang_ingin_disakin, nilai_awal, array_yang_menyalin, nilai_awal, panjang)
         */
        int[] n1 = {9,8,7,6,5,4,7};
        int[] n2 = new int[n1.length];
        int[] n3 = new int[5];

        System.out.println("n1 = " + Arrays.toString(n1));

        // Menyalin n1 ke n2
        System.arraycopy(n1, 0,n2,0,n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));

        // Menyalin sebagian n1 ke n3
        System.arraycopy(n1,3,n3,1,3);
        System.out.println("n3 = " + Arrays.toString(n3));

        // NB: Nilai awal default element array tipe int adalah 0.

        // ==> Menalin Array Menggunakan Method copyOfRange() <==
        System.out.println("\n===> Menyalin Array Menggunakan Method copyOfRange <===");

        int[] x = {-1,3,4,-5,7,10, -11};
        System.out.println("x = " + Arrays.toString(x));

        int[] x1 = Arrays.copyOfRange(x, 0, x.length);
        System.out.println("x1 = " + Arrays.toString(x1));

        int[] x2 = Arrays.copyOfRange(x, 2, 9);
        System.out.println("x2 = " + Arrays.toString(x2));


        // Menyalin Array 2D Menggunakan Loop
        System.out.println("\n==> Menyalin Array Menggunakan Loop <==");
        int[][] y = {
                {1,2,3},
                {-2,3,-5,6,-7,8,9},
                {10,11,13,15}
        };
        System.out.println("y = " + Arrays.deepToString(y));

        int[][] y1 = new int[y.length][];

        for (int i = 0; i < y1.length; i++) {
            y1[i] = new int[y[i].length];

            for (int j = 0; j < y1[i].length; j++) {
                y1[i][j] = y[i][j];
            }
        }
        y1[0][0] = 10;
        System.out.println("y1 = " + Arrays.deepToString(y1));

        // Loop bisa diganti dengan arraycopy() atau copyOf() seperti teknik copy array 1D.

        // Contoh Copy Array 2D Menggunakan arraycopy()
        System.out.println("\n===> Copy Array Menggunakan arraycopy() <===");

        int[][] y2 = new int[y.length][];

        for (int i = 0; i < y.length; i++) {

            y2[i] = new int[y[i].length];
            System.arraycopy(y[i], 0, y2[i], 0, y[i].length);
        }
        System.out.println("y2 = " + Arrays.deepToString(y2));

        // NB: Arrays.deepToString() memiliki representasi baik untuk mencetak array 2D.
    }
}
