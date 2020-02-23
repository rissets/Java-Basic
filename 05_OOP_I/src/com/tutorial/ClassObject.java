package com.tutorial;

/*
Pemrograman java adalah pemrograman yang beroreantasi pada object(OOP),
sehingga memungkinkan kita untuk membagi permaslahan kompleks menjadi set yang lebih kecil dengan membuat object.
- secara global Object memiliki 2 perilaku:
    1 - state
    2 - behavior
- contoh:
  - lampu adalah benda - memiliki trun off dan trun of.
                       - kita bisa melakukan on of pada lampu. (behavior/perilaku)

  - Sepedah adalah benda - memiliki gerigi, dua roda, dan jumlah gerigi.
                         - kita bisa melakukan pengereman, mempercepat, dan mengubah gierigi. (behavior/perilaku)

- OOP memiliki 3 komponen utama:
    1 - enkapsulasi data.
    2 - pewarisan.
    3 - polimarfisme.


* Class: sebuah blue print(sketsa/prototype) untuk object.
    - contoh: class adalah sketsa atau prototype dari rumah, sedangkan rumahnya sendiri adalah object dari class.
              karena banyak rumah yang dibuat dari seketsa yang sama, kita dapat membuat banyak object dari satu class.

    - sebelum membuat class kita perlu mendefinisikannya.
        class Lampu{
            // code
            }

* Objecct: representasi dari class
    - Ketika kelas didefinisikan, hanya spesifikasi untuk objek yang ditentukan,
    - tidak ada memori atau penyimpanan yang dialokasikan.
    - Untuk mengakses anggota yang ditentukan dalam kelas, kita perlu membuat objek.
 */


// Membuat class
class Lampu {
    // instance variabel
    private boolean aktif;

    // method
    public void is_aktif(){
        aktif = true;
    }

    // method
    public void non_aktif(){
        aktif = false;
    }

    // method
    public void status_lampu(){
        System.out.println("Apakah lampu menyala? " + aktif);
    }

    /*
    - kata kunci private membuat variabel atau method hanya bisa diakses oleh class yang sama.
    - kata kunci public membuat variabel atau method bisa diakses diluar class.
     */

}

public class ClassObject {
    public static void main(String[] args) {

        // Membuat object
        Lampu l1 = new Lampu(); // object dari class Lampu
        Lampu l2 = new Lampu(); // object dari class Lampu

        // mengakses komponen pada class(method dan variabel) menngunakan operasi "."

        l1.is_aktif(); // mengakses semua yang berada didalam tubuh method
        l2.non_aktif();

        l1.status_lampu();
        l2.status_lampu();





    }
}























