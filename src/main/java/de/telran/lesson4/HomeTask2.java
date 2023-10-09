package de.telran.lesson4;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {

        int arg1;
        int arg2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        arg1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        arg2 = scanner.nextInt();
        System.out.println();
        System.out.println("Результаты математических операций:");

        mathAddition(arg1, arg2);
        mathSubtraction(arg1, arg2);
        mathMultiplication(arg1, arg2);
        mathDivision(arg1, arg2);
    }
    private static void mathAddition(int arg1, int arg2) {
            int mySum = arg1 + arg2;
            System.out.println("Сложение: " +arg1 +" + "+arg2 +" = " +mySum);
    }
    private static void mathSubtraction(int arg1, int arg2) {
            int mySubtr = arg1 - arg2;
            System.out.println("Вычитание: " +arg1 +" - "+arg2 +" = " +mySubtr);
    }
    private static void mathMultiplication(int arg1, int arg2) {
            int myMulti = arg1 * arg2;
            System.out.println("Умножение: " +arg1 +" * "+arg2 +" = " +myMulti);
    }
    private static void mathDivision(int arg1, int arg2) {
            double arg1d = arg1;
            double arg2d = arg2;
            double myDiv = arg1d / arg2d;
            System.out.println("Деление: " +arg1 +" / "+arg2 +" = " +myDiv);
    }

}

/*
Создайте методы с математическими операциями +, -, *, /
Каждый метод принимает два числа в параметрах и возвращает результат
Вызовите все методы в main
Результат распечатайте в консоль
*/







