package com.tutorial;
/*
- Method/Fungsi: adalah blok kode yang ditulis untuk melakukan tugas tertentu.
- Method/Fungsi ada dua jenis:
    1 - Fungsi Perpustakaan Standart Library
    2 - Fungsi yang dibuat manual oleh user

1 - Method Standart Library: adalah metode bawaan di Jawa yang tersedia untuk digunakan.
    Pustaka standar ini datang bersama dengan Java Class Library (JCL) dalam file arsip Java (* .jar) dengan JVM dan JRE.
    - Sebagai contoh:
        print()adalah metode java.io.PrintSteam. The print("...")mencetak string dalam tanda kutip.
        sqrt()adalah metode kelas Matematika. Ini mengembalikan akar kuadrat dari angka.
2 - Method yang dibuat manual oleh pengguna:
        seorang user di perbolehkan untuk membuat method sendiri didalam class.
 */

// Mendefinisikan Method
public class MethodJava {
    public static void MyMethod() {
        /*
        - Kata kunci public membuat myMethod()metode public. Anggota publik dapat diakses dari luar kelas.
        - Kata kunci static menunjukkan bahwa metode dapat diakses tanpa membuat objek kelas.
        - Kata kunci void menandakan bahwa metode ini tidak mengembalikan nilai apa pun.
        - Dalam program di atas, metode kami tidak menerima argumen apa pun. Oleh karena itu kurung kosong ().
         */
        System.out.println("==> Tulisan ini di cetak dari method\n");
    }

    // Method dengan argument dan pengembalian
    public static int Kuadrat(int i) {
        return i * i;
    }


    public static void main(String[] args) {
        int hasil, n;
        n = 3;
        hasil = Kuadrat(n);
        System.out.println("Hasil dari " + n + " kuadrat: " + hasil);

        n = 5;
        hasil = Kuadrat(n);
        System.out.println("Hasil dari " + n + " kuadrat: " + hasil);
        MyMethod();
    }
}

/*
- Apa keuntungan menggunakan metode?
    - Keuntungan utama adalah penggunaan kembali kode. Anda dapat menulis metode satu kali, dan menggunakannya beberapa kali.
      Anda tidak perlu menulis ulang seluruh kode setiap kali. Anggap saja, "tulis sekali, gunakan kembali beberapa kali."
    - Metode membuat kode lebih mudah dibaca dan lebih mudah untuk di-debug.
 */










