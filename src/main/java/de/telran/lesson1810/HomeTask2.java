package de.telran.lesson1810;

import java.util.Arrays;
import java.util.Random;

public class HomeTask2 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arrInt = new int[5];

        for (int i = 0; i < arrInt.length; i++) {
            int randomInt = random.nextInt(90) + 10;
            arrInt[i] = randomInt;
        }

        System.out.println(Arrays.toString(arrInt));

        boolean isIncrease = true;

        for (int i = 1; i <= arrInt.length; i++) {
            if (arrInt[i] <= arrInt[i - 1])
                isIncrease = false;
            break;
        }

        if (isIncrease)
            System.out.println("Массив в строго возрастающей последовательности");
        else
            System.out.println("Массив не в строго возрастающей последовательности");
    }

}

/*
Создайте массив из 5 случайных целых чисел из интервала [10;99]
Выведите его на консоль в строку.
Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */