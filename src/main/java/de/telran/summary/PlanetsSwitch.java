package de.telran.summary;

import java.util.Scanner;

public class PlanetsSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the Solar system planet:");
        int numberPlanet = scanner.nextInt();

        System.out.println(planet(numberPlanet));
    }

    public static String planet (int a) {
        switch (a) {
            case 1:
                return "Mercury";
                case 2:
                return "Venus";

            case 3:
                return "Earth";

            case 4:
                return "Mars";

            case 5:
                return "Jupiter";

            case 6:
                return "Saturn";

            case 7:
                return "Uran";

            case 8:
                return "Neptun";

            default:
                return "There are only 8 planets in the Solar system.";
        }


    }



}
/*
Пользователь вводит номер планеты солнечной системы. Программа определяет имя планеты и выводит в консоль.
Напишите метод, который по имени планеты возвращает её краткое описание. Вызовите метод в main. Используйте для решения операторы switch.
 */