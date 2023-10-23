package de.telran.lesson1810;

import java.util.Arrays;
import java.util.Random;

public class HomeTask1 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arrInt = new int[8];

        for (int i = 0; i < arrInt.length; i++) {
            int randomInt = random.nextInt(50) + 1;
            arrInt[i] = randomInt;
        }

        System.out.println(Arrays.toString(arrInt));

        for (int i = 1; i <= arrInt.length; i += 2) {
            arrInt[i] = 0;
        }
        System.out.println(Arrays.toString(arrInt));
    }
}

/*
Создайте массив из 8 случайных целых чисел из интервала [1;50]
Выведите массив на консоль в строку.
Замените каждый элемент с нечетным индексом на ноль.
Снова выведете массив на консоль в отдельной строке.
 */