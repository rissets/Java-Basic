package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Operator Bitwise --> operator yang dilakaukan pada nilai bit.

        byte a = 9,b,c;
        String a_byte,b_byte,c_byte;
        a_byte = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');

        // -----> SHIFT LEFT
        System.out.println("===== SIFT LEFT (<<) =====");
        System.out.printf("%s = %d\n", a_byte,a);
        b = (byte)(a << 1);
        b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",b_byte,b);

        // -----> SHIFT RIGTH
        System.out.println("\n===== SIFT RIGTH (>>) =====");
        c = (byte)(a >> 1);
        c_byte = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d\n", c_byte,c);

        // -----> BITWISE OR (|)
        System.out.println("\n===== BITWISE OPERATOR (|) =====");
        a = 24;
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_byte,a);
        b = 12;
        b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d\n",b_byte,b);

        System.out.println("------------- OR (|)");
        c = (byte)(a | b);
        c_byte = String.format("%8s", Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d\n",c_byte,c);

        // -----> BITWISE XOR (^)
        System.out.println("------------- XOR (^)");
        c = (byte)(a ^ b);
        c_byte = String.format("%8s", Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d\n", c_byte,c);

        // -----> BITWISE AND (&)
        System.out.println("------------- AND (&)");
        c = (byte)(a & b);
        c_byte = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d\n", c_byte,c);

        // -----> Negasi / NOT (~)
        System.out.println("\n===== NOT (^) =====");
        a = 24;
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_byte,a);
        b = (byte)(~a);
        b_byte = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d\n",b_byte,b);
    }
}
