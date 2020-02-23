package com.tutorial;

public class ForEachLoop {
    public static void main(String[] args){
        /*
        - Jika Anda bekerja dengan array dan koleksi, Anda dapat menggunakan sintaks alternatif forloop yang disempurnakan.
          untuk beralih melalui item array / koleksi.
        - hal ini biasa disebut sebagai for-each loop karena loop berulang melalui setiap elemen array / koleksi.

        - Sintaksnya:
            for(tipe_data item: koleksi){
                // code blok;
            }
           NB: - koleksi adalah kumpulan atau variabel array yang harus Anda lewati.
               - item adalah item tunggal dari koleksi.

        - Cara Kerja:

         */

        // Perbandingan for loop biasa dengan for-each loop
        char[] vocals = {'a','i','u','e','o'};
        // for loop
        System.out.println("=====> For Loop <=====");
        for(int i = 0; i < vocals.length; i++){
            System.out.println(vocals[i]);
        }
        // for-each loop
        System.out.println("\n=====> For-each Loop <=====");
        for(char vocal: vocals){
            System.out.println(vocal);
        }

        System.out.println("====> For-each Loop Contoh <=====");
        String[] names = {"Sherlock", "Holmes", "Conan", "Doyle", "Arthur" };
        for (String name :
                names) {
            System.out.println("Nama saya adalah " + name);
        }
    }
}
