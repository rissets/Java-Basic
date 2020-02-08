package com.tutorial;

public class Main {
    public static void main(String[] args){
        /*
           - Operator Logika adalah suatu operasi yang meghasilkan nilai boolean(true/false)
           - Operator Logika Java = OR(||), AND(&&), XOR(^), NOT/Negasi(!)
         */

        // Table Operator Logika
        boolean a,b,c;

        // ----- OR (||) -----
        System.out.println("==== OR (||) ====");
         a = false;
         b = false;
         c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c  + "\n");

        // ---- AND (&&) ----
        System.out.println("==== AND (&&) ====");

        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c + "\n");

        // ---- XOR (^) ----
        System.out.println("==== XOR (^) ====");

        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c + "\n");

        // ---- NOT/Negasi (!) ----
        System.out.println("==== NOT (!) ====");

        a = true;
        b = !a;
        System.out.println(a + " --> (!) " + b);

        a = false;
        b = !a;
        System.out.println(a + " --> (!) " + b);



    }
}
