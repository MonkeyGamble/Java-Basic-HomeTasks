package de.telran.lesson0210;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word 1 (only an even number of characters): ");
        String word1 = scanner.nextLine();

        System.out.print("Enter word 2 (only an even number of characters): ");
        String word2 = scanner.nextLine();

        if (word1.length()%2 == 0 && word2.length()%2 == 0) {
            int halfWord1 = word1.length() / 2;
            int halfWord2 = word2.length() / 2;

            String resultWord = word1.substring(0,halfWord1)+ word2.substring(halfWord2);
            System.out.println("Result Word = " +resultWord);
        }
        else {
            System.out.println("Amount of characters is uneven!");
        }
    }

}


/*
 Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
Например:
ввод - mama, papa
вывод - mapa
 */