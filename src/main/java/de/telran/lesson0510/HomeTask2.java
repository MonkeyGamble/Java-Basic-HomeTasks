package de.telran.lesson0510;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What size of pizza do you want to buy, 24 or 28 cm?: ");
        int choice = scanner.nextInt();

        int pizza1 = 24, pizza2 = 28;
        int radPizza1 = pizza1/2, radPizza2 = pizza2/2;
        double squarePizza1 = Math.PI*(radPizza1*radPizza1);
        double squarePizza2 = Math.PI*(radPizza2*radPizza2);
        int caloriesInPizza1 = (int) (squarePizza1 * 40);
        int caloriesInPizza2 = (int) (squarePizza2 * 40);
        int extraCalories = (int) (caloriesInPizza2 - caloriesInPizza1);

        switch (choice) {
            case 24:
                System.out.println("By purchasing this pizza, you will eat " + caloriesInPizza1 + " calories");
                break;
            case 28:
                System.out.println("By purchasing this pizza, you will eat " + extraCalories + " more calories");
                break;
            default:
                System.out.println("There is no this size pizza for sale.");
        }

    }

}


/*
Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
 */