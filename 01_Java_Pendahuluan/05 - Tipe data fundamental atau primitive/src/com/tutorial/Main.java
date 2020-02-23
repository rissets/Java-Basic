package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Tipe data primitif/fundamental java : integer, byte, sort, lang, float, char, boolean

        // Integer (satuan)
        int i = 10;
        System.out.println("==========INTEGER==========");
        System.out.println("Nilai integer i = " + (i + 1) );
        System.out.println("Nilai max integer = " + Integer.MAX_VALUE);
        System.out.println("Nilai min integer = " + Integer.MIN_VALUE);
        System.out.println("Besar integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar integer = " + Integer.SIZE + " bit");

        // Byte (satuan)
        byte b = 10;
        System.out.println("==========BYTE==========");
        System.out.println("Nilai byte b = " + (b + 1) );
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai min byte = " + Byte.MIN_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar byte = " + Byte.SIZE + " bit");

        // Short (satuan)
        short s = 10;
        System.out.println("==========SHORT==========");
        System.out.println("Nilai short s = " + (s + 1) );
        System.out.println("Nilai max short = " + Short.MAX_VALUE);
        System.out.println("Nilai min short = " + Short.MIN_VALUE);
        System.out.println("Besar short = " + Short.BYTES + " bytes");
        System.out.println("Besar short = " + Short.SIZE + " bit");

        // Long (satuan)
        long l = 10;
        System.out.println("==========LONG==========");
        System.out.println("Nilai long l = " + (l + 1) );
        System.out.println("Nilai max long = " + Long.MAX_VALUE);
        System.out.println("Nilai min long = " + Long.MIN_VALUE);
        System.out.println("Besar long = " + Long.BYTES + " bytes");
        System.out.println("Besar long = " + Long.SIZE + " bit");

        // Double (koma, bilangan real)
        double d = 10.5d;
        System.out.println("==========DOUBLE==========");
        System.out.println("Nilai double d = " + (d + 1) );
        System.out.println("Nilai max double = " + Double.MAX_VALUE);
        System.out.println("Nilai min double = " + Double.MIN_VALUE);
        System.out.println("Besar double = " + Double.BYTES + " bytes");
        System.out.println("Besar double = " + Double.SIZE + " bit");

        // Float (koma, bilangan real)
        float f = -10.5f;
        System.out.println("==========FLOAT==========");
        System.out.println("Nilai float f = " + (f + 1) );
        System.out.println("Nilai max float = " + Float.MAX_VALUE);
        System.out.println("Nilai min float = " + Float.MIN_VALUE);
        System.out.println("Besar float = " + Float.BYTES + " bytes");
        System.out.println("Besar float = " + Float.SIZE + " bit");

        // Char (karakter) berdasarkan ASCII
        char c = 'c';
        System.out.println("==========CHAR==========");
        System.out.println("Nilai char c = " + c );
        System.out.println("Nilai max char = " + Character.MAX_VALUE);
        System.out.println("Nilai min char = " + Character.MIN_VALUE);
        System.out.println("Besar char = " + Character.BYTES + " bytes");
        System.out.println("Besar char = " + Character.SIZE + " bit");

        // Boolean (nilai true atau false)
        boolean vol = true;
        System.out.println("==========BOOLEAN==========");
        System.out.println("Nilai boolean vol = " + vol );
        System.out.println("Nilai max boolean = " + Boolean.TRUE);
        System.out.println("Nilai min boolean = " + Boolean.FALSE);
    }
}
