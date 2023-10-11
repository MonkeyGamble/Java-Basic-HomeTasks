package de.telran.lesson0510;

public class HomeTask1 {
    public static void main(String[] args) {

        String a16 = "333";
        String b10 = "819";
        String c2 = "101101";
        String d10 = "124";

        long a10 = Long.parseLong(a16, 16);
        String a10out = Long.toString(a10, 10);
        System.out.println("Число 333(16) в десятиричной системе = " +a10out);

        long b16 = Long.parseLong(b10, 10);
        String  b16out = Long.toString(b16, 16);
        System.out.println("Число 819(10) в шестнадцатиричной системе = " +b16out);

        long c10 = Long.parseLong(c2, 2);
        String  c10out = Long.toString(c10, 10);
        System.out.println("Число 101101(2) в десятиричной системе = " +c10out);

        long d2 = Long.parseLong(d10, 10);
        String d2out = Long.toString(d2, 2);
        System.out.println("Число 124(10) в двоичной системе = " +d2out);

    }
}


/*
Переведите число 333 из 16-ричной в 10-ричную
Переведите число 819 из 10-ричной в 16-ричную
101101 в двоичной, переведите в 10-ричную
124 в десятичной, переведите в 2-ичную
 */


