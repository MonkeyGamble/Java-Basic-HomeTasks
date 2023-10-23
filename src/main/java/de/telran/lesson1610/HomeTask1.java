package de.telran.lesson1610;

import java.util.Random;

public class HomeTask1 {
    public static void main(String[] args) {

        Random random = new Random();
        int minTemp = -300;
        int maxTemp = +300;
        int temp1 = random.nextInt(maxTemp - minTemp) + minTemp;
        int temp2 = random.nextInt(maxTemp - minTemp) + minTemp;

        System.out.println("Температура первой колбы = " + temp1);
        System.out.println("Температура второй колбы = " + temp2);

        if (isDeviceWork(temp1, temp2) == true)
            System.out.println("Прибор работает корректно");
        else
            System.out.println("Прибор работает некорректно");

    }

    static boolean isDeviceWork(int temp1, int temp2) {
        boolean isDeviceWork = true;
        if (temp1 > 100 && temp2 < 100)
            return isDeviceWork;
        else
            return isDeviceWork = false;

    }

}









/*
Представим, что у нас есть устройство, в котором две колбы.
Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
Вы должны написать метод, который проверяет это устройство.
Ваша программа должна иметь переменные temperature1 и temperature2.
В результате метод возвращает true или false.
 */