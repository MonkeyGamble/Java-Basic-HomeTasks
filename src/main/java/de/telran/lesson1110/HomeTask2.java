package de.telran.lesson1110;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if (isLeap(year))
            System.out.println(year +" is a leap year");
        else
            System.out.println(year +" is not a leap year");
    }
    static boolean isLeap (int year) {
        return year > 1584 && ((year%400==0) || (year%4==0 && year%100!=0));
    }
}

/*
Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год. Метод isLeap проверяет високосный год или нет.
 */