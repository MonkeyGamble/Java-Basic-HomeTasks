package de.telran.summary;

import java.util.Scanner;

public class StudentsIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество балов: ");
        int point = scanner.nextInt();

        if (point >= 80)
            System.out.println("Оценка - A");
        if (point >= 60 && point <= 79)
            System.out.println("Оценка - B");
        if (point >= 40 && point <= 59)
            System.out.println("Оценка - C");
        if (point >= 20 && point <= 39)
            System.out.println("Оценка - D");
        if (point < 20)
            System.out.println("Оценка - F");
    }
}

/*
Создайте программу для оценки студентов на основе их баллов. Пользователь вводит, сколько баллов набрал (от 0 до 100).
Программа должна присваивать буквенные оценки (A, B, C, D, F) в зависимости от полученных баллов: A за 80 баллов и более,
B за 60-79 баллов, С за 40-59 баллов, D за 20-39 баллов, F в остальных случаях. Используйте операторы If.
 */