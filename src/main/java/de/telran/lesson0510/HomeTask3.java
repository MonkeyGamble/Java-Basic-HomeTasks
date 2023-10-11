package de.telran.lesson0510;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в Евро: ");
        double sumEuro = scanner.nextDouble();

        System.out.printf("В долларах вы получите: %.02f", conversionEuroUsd(sumEuro));

    }
    static double conversionEuroUsd (double sumEuro) {
        double sumDollar;
        double exchangeRate = 1.059;
        return sumDollar = sumEuro * exchangeRate;
    }

}
   /*
   Программа запрашивает у пользователя сумму в Евро для конвертации
Реализовать метод, который конвертирует полученную сумму в сумму в долларах США
    */