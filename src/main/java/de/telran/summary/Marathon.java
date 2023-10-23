package de.telran.summary;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во минут, за которое вы пробежали марафон: ");
        double myMarathon = scanner.nextDouble();
        int resultHours = (int )myMarathon / 60;
        int diffToChampHours = Math.abs(2-resultHours);
        int diffToChampMinutes = (int) (Math.abs(121 -myMarathon))%60;

        if (diffToChampHours >0) {
            System.out.println("Вы медленнее чемпиона мира на " +diffToChampHours +" часов и " +diffToChampMinutes +" минут");
        }
        else {
            System.out.println("Вы медленнее чемпиона мира на " +diffToChampMinutes +" минут");
        }
    }
}

/*
Пользователь вводит, за какое количество минут он пробежал марафон (42 км).
Программа должна вывести на сколько часов и минут пользователь медленнее, чем чемпион мира,
пробежавший марафон за 2 часа 1 минуту. Выведите результат в виде: “Вы медленнее на X часов и Y минут”.
 */