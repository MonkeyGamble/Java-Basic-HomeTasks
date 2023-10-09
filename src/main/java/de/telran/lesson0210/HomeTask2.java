package de.telran.lesson0210;

import java.util.Locale;
import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Enter first argument: ");
        double arg1 = scanner.nextDouble();

        System.out.print("Enter second argument: ");
        double arg2 = scanner.nextDouble();

        System.out.println("Results of math operations:");
        System.out.println(arg1 +" + " +arg2 +" = " +getSum(arg1, arg2));
        System.out.println(arg1 +" - " +arg2 +" = " +getSubtraction(arg1, arg2));
        System.out.println(arg1 +" * " +arg2 +" = " +getMultiplication(arg1, arg2));
        System.out.println(arg1 +" / " +arg2 +" = " +getDivision(arg1, arg2));
    }
    static double getSum (double arg1, double arg2) {
        return arg1 + arg2;
    }
    static double getSubtraction (double arg1, double arg2) {
        return (arg1 - arg2);
    }
    static double getMultiplication  (double arg1, double arg2) {
        return arg1 * arg2;
    }
    static double getDivision  (double arg1, double arg2) {
        return arg1 / arg2;
    }
}


/*
Реализовать программу, выводящую на экран результаты:
Сложения двух чисел
Вычитания двух чисел
Умножения двух чисел
Деления двух чисел
Каждая из арифметических операций должна быть реализована как отдельный метод.
 */