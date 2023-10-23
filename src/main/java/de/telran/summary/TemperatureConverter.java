package de.telran.summary;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        double inputGrad = scanner.nextDouble();
        double calvinGrad = inputGrad +273.15;
        double fahrenGrad = (inputGrad*9/5) +32;
        System.out.println(inputGrad +" градусов Цельсия  = " +calvinGrad + " Кельвинов");
        System.out.println(inputGrad +" градусов Цельсия  = " +fahrenGrad + " градусов по Фаренгейту");

    }

}

/*
Создайте конвертер температур градусов Цельсия в градусы Кельвина и градусы Фаренгейта.
 */