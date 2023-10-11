package de.telran.lesson0910;

import java.util.Locale;
import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Введите первый аргумент: ");
        double n = scanner.nextDouble();
        System.out.print("Введите второй аргумент: ");
        double m = scanner.nextDouble();

        double res1 = Math.abs(n - 10);
        double res2 = Math.abs(m - 10);

        if (res1 > res2) {
            System.out.println("Число " +m +" ближе к 10");
        }
        if (res2 > res1) {
            System.out.println("Число " +n +" ближе к 10");
        }
        else if (res1 == res2) {
            System.out.println("Оба числа одинаково близки к 10");
        }
    }
}

/*
Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
Числа могут быть, как целочисленные, так и дробные.
 */