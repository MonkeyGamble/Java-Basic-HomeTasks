package de.telran.summary;

import java.util.Scanner;

public class TriangleTernary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длины сторон треугольника: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String result = a == b && b == c ? "Треугольник равносторонний" : a == b || a == c || b == c ? "Треугольник равнобедренный" : "Треугольник разносторонний";

        System.out.println(result);

    }
}

/*
Разработайте программу, которая принимает на вход длины трех сторон треугольника и определяет его тип (равносторонний,
равнобедренный или разносторонний). Используйте тернарные операторы.
 */