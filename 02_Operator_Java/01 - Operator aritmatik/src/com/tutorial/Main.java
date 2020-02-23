package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // Operasi Aritmatika : pertambahan(+), pengurangan(-), perkalian(*), pembagian(/), modulus(%)

        int var1 = 10;
        int var2 = 5;

        int hasil;

        // 1 - Pertambahan(+)
        hasil = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + hasil);

        // 2 - Pengurangan(-)
        hasil = var1 - var2;
        System.out.printf("%d - %d = %d \n",var1,var2,hasil);

        // 3 - Perkalian(*)
        hasil = var2 * var1;
        System.out.printf("%d * %d = %d \n",var2,var1,hasil);

        //4 - Pembagian(/)
        hasil = var1 / var2;
        System.out.println(var1 + " / " + var2 + " = " + hasil );

        //5 - Modulus(%)
        hasil = var1 % var2;
        System.out.println(var1 + " % " + var2 + " = " + hasil);

        // NB : Tipe data Integer tidak menerima koma, jadi hasilnya dibuulatkan menjadi satuan.
        //      untuk menentukan hasil yang real kita harus mengkonversikan tipe data.
        //     * 11 - konversi tipe data numerik ---(pelajaran selanjutnya)---

    }
}
