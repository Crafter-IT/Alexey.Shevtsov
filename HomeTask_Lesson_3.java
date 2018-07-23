package ru.geekbrains.java1.lesson1;

import java.util.Random;
import java.util.Scanner;

public class HomeTask_Lesson_3 {
    public static void main(String[] args) {


////    1 ДОМАШНЕЕ ЗАДАНИЕ
//
//        Scanner xy = new Scanner(System.in);     // создание объекта класса Scanner
//        Random Rand = new Random();              // создание объекта класса Random
//        int x = 1;
//        while (x == 1) {                            // В этом цикле задаются правила игры и определяется случайное число
//            System.out.println("Было загадано число Х от 0 до 9. Введите число и попробуйте его угадать:");
//
//            int y = Rand.nextInt(10);       // определение случайного числа
//            Boolean z = false;
//
//            while (z != true) {                    // В этом цикле вводится число и сравнивается с заданным (программой) ранее числом
//                int xx = xy.nextInt();              // введение числа для сравнения
//                if (xx < y) {
//                    System.out.println("Загаданное число больше");
//                } else if (xx > y) {
//                    System.out.println("Загаданное число меньше");
//                } else if (xx == y) {
//                    System.out.println("Вы угадали, загаданное число " + y);
//                    z = true;
//                }
//            }
//            System.out.print("Повторить игру еще раз? 1 – да / 0 – нет ");   // Тут программа предлагает еще раз поиграть
//            x = xy.nextInt();
//        }



////    2 ДОМАШНЕЕ ЗАДАНИЕ
//
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
//                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
//                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//
//        Random xx = new Random();                           // создание объекта класса Random
//        int x = xx.nextInt(words.length);
//        String str = words[x];                              // Присваивает случайное слово из массива
//        Scanner yy = new Scanner(System.in);                // создание объекта класса Scanner
//
//        System.out.println("Было загадано случайное слово.");
//
//      //  System.out.println(str);             //ОТОБРАЖАЕТ ЗАГАДАННОЕ СЛОВО
//
//        System.out.print("Введите слово: ");
//        Boolean v = false;
//
//        while (v != true) {
//
//            String s = yy.nextLine();            // Вводим слово
//
//            if (s.equals(str) != true) {        // проверяется совпаает ли введенное слово с загаданным
//                char[] ch = new char[15];        // задаем массив в который будут вноситься угаданные части слова
//
//                for (int i = 0; i < 15; i++) {   // заполняем этот массив символом "#"
//                    ch[i] = 35;
//                }
//                int t = str.length();
//                if (t > s.length()) {t = s.length(); }  // выясняем в каком слове больше букв. в загаданном или введенном.
//
//                for (int i = 0; i < t; i++) {      // в цикле идет сравнение слов по буквам за длицу цикла взято слово с меньшим количеством букв.
//
//                    if (str.charAt(i) == s.charAt(i)) {      // Посимвольно сравниваем слова. Ели буквы совпадают то в массиве меняем "#" на эту букву
//                        ch[i] = str.charAt(i);
//                    }
//                }
//                System.out.print("Слово не угадано. ");
//
//                for (char j : ch) {                  // Выводит угаданные буквы на экран
//                    System.out.print(j);
//                }
//                System.out.println();
//                System.out.print("Введите слово: ");
//
//            } else {
//                v = true;
//                System.out.println("Вы угадали. Правильное слово " + str);
//            }
//        }



    }
}
