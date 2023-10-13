package de.telran.lesson1110;

import java.util.Random;

public class HomeTask1 {
    public static void main(String[] args) {

        Random random = new Random();

        boolean isEdekaOpen = random.nextBoolean();
        boolean isReweOpen = random.nextBoolean();
        System.out.println("Edeka open - "+isEdekaOpen);
        System.out.println("REWE open - "+isReweOpen);

        System.out.println("Я могу купить еду - " +canBuy(isEdekaOpen, isReweOpen));
    }
    static boolean canBuy (boolean isEdekaOpen, boolean isReweOpen) {
        return (isEdekaOpen || isReweOpen);
    }
}

/*
Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
Реализует логический метод canBuy,  возвращающий boolean
Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
Отобразите строку «Я могу купить еду, это ……» и значение.
 */