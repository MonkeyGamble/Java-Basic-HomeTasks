package de.telran.lesson1610;

import java.util.Random;

public class HomeTask2 {
    public static void main(String[] args) {

        int n = 21;
        int countDays = countDaysToExtract(n);
        System.out.println("Для снятия всех денег со счета вам понадобится - " +countDays +" дней");

    }

    static int countDaysToExtract(int n) {

        int countDays = 0;

        while (n > 1) {

            int maxDivisor = 1;

            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0)
                    maxDivisor = i;
            }

            if (maxDivisor == 1)
                n--;
            else
                n -= maxDivisor;

            countDays++;

        }

        if (n == 1)
            countDays++;

        return countDays;

    }

}

/*
У вас на банковском счету N долларов.
Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
Примечание: если оставшаяся сумма равна 1, вы можете снять ее.


Ввод:  N = 21
Выход:  7
Объяснение:  N = 21
Снято 7, осталось = 14
Снято 7, осталось = 7
Снято 1, осталось = 6
Снято 3, осталось = 3
Снято 1, осталось = 2
Снято 1, Осталось = 1
Снято 1, осталось = 0
 */