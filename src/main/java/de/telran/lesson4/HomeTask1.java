package de.telran.lesson4;

public class HomeTask1 {
    public static void main(String[] args) {

        String myString = new String("I study Basic Java!");

        System.out.println("Предпоследний символ строки = " +myString.charAt(myString.length()-2));

        System.out.println("Содержит ли строка подстроку 'Java' - " + myString.contains("Java"));

        int strLength = myString.length();
        System.out.println("Вырезаем из строки 'Java' - "  +myString.substring(0, (strLength-5)) +myString.charAt(strLength-1));

        System.out.println("Меняем все символы 'а' на 'о' - " +myString.replace('a', 'o'));

        System.out.println("Преобразовываем все символы к верхнему регистру - " +myString.toUpperCase());

        System.out.println("Преобразовываем все символы к нижнему регистру - " +myString.toLowerCase());


    }
}

/*
Создайте строку через new - I study Basic Java!
Распечатать предпоследний символ строки. Используем метод String.charAt().
Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
Вырезать строку Java c помощью метода String.substring().
Заменить все символы “а” на “о”.
Преобразуйте строку к верхнему регистру.
Преобразуйте строку к нижнему регистру.
*/



