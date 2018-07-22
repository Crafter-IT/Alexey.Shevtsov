package ru.geekbrains.java1.lesson1;

import java.util.Random;
import java.util.Scanner;

public class HomeTask_Lesson_3 {
    public static void main(String[] args) {



        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random xx = new Random();                           // создание объекта класса Random
        int x = xx.nextInt(words.length);
        String str = words[x];                              // Присваивает случайное слово из массива
        Scanner yy = new Scanner(System.in);                // создание объекта класса Scanner

        System.out.println("Было загадано случайное слово.");

      //  System.out.println(str); // ЗАГАДАННОЕ СЛОВО

        System.out.print("Введите слово: ");
        Boolean v = false;

        while (v != true) {

            String s = yy.nextLine();            // Вводим слово

            if (s.equals(str) != true) {        // проверяется совпаает ли введенное слово с загаданным
                char[] ch = new char[15];        // задаем массив в который будут вноситься угаданные части слова

                for (int i = 0; i < 15; i++) {   // заполняем этот массив символом "#"
                    ch[i] = 35;
                }
                int t = str.length();
                if (t > s.length()) {t = s.length(); }  // выясняем в каком слове больше букв. в загаданном или введенном.

                for (int i = 0; i < t; i++) {      // в цикле идет сравнение слов по буквам за длицу цикла взято слово с меньшим количеством букв.

                    if (str.charAt(i) == s.charAt(i)) {      // Посимвольно сравниваем слова. Ели буквы совпадают то в массиве меняем "#" на эту букву
                        ch[i] = str.charAt(i);
                    }
                }
                System.out.print("Слово не угадано. ");

                for (char j : ch) {                  // Выводит угаданные буквы на экран
                    System.out.print(j);
                }
                System.out.println();
                System.out.print("Введите слово: ");

            } else {
                v = true;
                System.out.println("Вы угадали. Правильное слово " + str);
            }
        }
    }
}
