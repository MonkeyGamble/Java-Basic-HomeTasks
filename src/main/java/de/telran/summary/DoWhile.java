package de.telran.summary;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        Random random = new Random();
        // int count = 0;
        int count = random.nextInt(5) + 1;
        int i = 1;
        System.out.println(count);
        do {
            System.out.println("I can everything!!!");
            i++;
        } while (i <= count);



    }


}


/*
Напишите программу, которая при запуске выводит в консоль строку "Я всё смогу" случайное число раз.
 */