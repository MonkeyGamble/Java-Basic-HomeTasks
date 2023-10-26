package de.telran.lesson2310;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {

        int[] myArr = {1, 2, 3, 5};
        int[] myArr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        System.out.println("Array of integers 1: " + Arrays.toString(myArr));
        System.out.println("Missing array element - " + missingElement(myArr));
        System.out.println();
        System.out.println("Array of integers 2: " + Arrays.toString(myArr2));
        System.out.println("Missing array element - " + missingElement(myArr2));

    }

    static int missingElement(int[] Arr) {
        int n = Arr.length + 1;
        int totalSumElements1ToN = n * (n + 1) / 2;

        int sumElementsArr = 0;
        for (int i = 0; i < Arr.length; i++) {
            sumElementsArr += Arr[i];
        }
        int missingElement = totalSumElements1ToN - sumElementsArr;
        return missingElement;
    }

}

/*
Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
input:
arr[] = {1,2,3,5}
out: 4

arr[] = {6,1,2,8,3,4,7,10,5}
out: 9

Сумма натуральных чисел от 1 до n = n * (n + 1) / 2

*/