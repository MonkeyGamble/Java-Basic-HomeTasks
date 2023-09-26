package de.telran.lesson2;

public class HomeTask2 {
    public static void main(String[] args) {
        int myInt = 345;
        int res100 = myInt / 100;
        int res10 = (myInt /10) % 10;
        int res1 = myInt % 10;

        System.out.println("Число " +myInt +" -> " +res100 +", " +res10 +", " +res1);
    }
}

/* Дано трехзначное число. Вывести на экран все цифры этого числа
Пример: 345
Вывод в консоль: Число 345 -> 3, 4, 5
*/