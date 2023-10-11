package de.telran.lesson0910;

import java.util.Random;

public class HomeTask2 {
    public static void main(String[] args) {

        Random random = new Random();
        int sec = random.nextInt(28800);
        System.out.println("До конца рабочего дня осталось " +sec+ " секунд");

        if (sec > 3600 && sec < 18000) {
            int remain = sec / 3600;
            System.out.println("До конца рабочего дня осталось " +remain+ " часа");
        }
        else if (sec >= 18000 && sec <= 28800) {
            int remain = sec / 3600;
            System.out.println("До конца рабочего дня осталось " +remain+ " часов");
        }
        else if (sec == 3600) {
            System.out.println("До конца рабочего дня остался 1 час");
        }
        else if (sec < 3600 && sec > 0) {
            System.out.println("До конца рабочего дня осталось меньше часа");
        }
        else System.out.println("Рабочий день окончен");
    }
}

/*
Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня.
Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
Требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
Объяснение: в переменную n должно записываться случайное (на время тестирования программы) целое число из диапазона от 0 до 28800,
далее оно должно выводиться на экран (для тех, кто понимает в секундах) и на следующей строке (для тех кто не понимает)
должна выводиться фраза о количестве полных часов, содержащихся в n секундах.
 */