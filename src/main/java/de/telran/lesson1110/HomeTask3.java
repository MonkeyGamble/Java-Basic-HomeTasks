package de.telran.lesson1110;
import java.util.Scanner;
public class HomeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        System.out.println("Maximum number = " +getMax(a1, a2, a3));
    }
    static int getMax (int a1, int a2, int a3) {

        int max = a1;
        if (a2 > max)
            max = a2;
        if (a3 > max)
            max = a3;
        return max;

        /*
        if (a1 > a2 && a1 > a3)
            return a1;
        if (a2 > a1 && a2 >a3)
            return a2;
        else
            return a3;
        */
    }
}
/*
Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер).
Напишите метод getMax, который принимает эти 3 параметра и возвращает наибольший из них.
Напечатает максимум из трех чисел.
 */