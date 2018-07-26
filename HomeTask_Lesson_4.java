package ru.geekbrains.java1.lesson1;

import java.util.Random;
import java.util.Scanner;

public class HomeTask_Lesson_4 {

    public static void main(String[] args) {

        String[][] SS = new String[5][5];  // задаем массив и присваиваем ему "*"
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                SS[i][j] = "*";
            }
        }

        Scanner sc = new Scanner(System.in);
        Random pc = new Random();

        for (;;) {

            MS(SS);

            if (Proverka(SS,4,"X") != false) {  System.out.println("ПОБЕДА!");    break; }
            if (Proverka(SS,4,"0") != false) { System.out.println("GAME OVER!"); break; }

            for (; ; ) {

                System.out.println("Введите координаты Х Y");
                System.out.print("Х: ");
                int y = sc.nextInt();
                System.out.print("Y: ");
                int x = sc.nextInt();
                System.out.println();

                if (x < 1 || y < 1 || x > 5 || y > 5) {
                    System.out.println("Введенное значение должно быть в диапазоне от 1 до 5");
                } else if ((SS[x - 1][y - 1]) != "*") {
                    System.out.println("В данной ячейке уже есть символ, введите другие координаты");
                } else {
                    SS[x - 1][y - 1] = "X";
                    break;
                }
            }

            int k =0;

            for (int i=0;i<5; i++){             // Здесь компьютер ищет свои варианты победы и подставляет туда 0
                for (int j=0;j<5; j++){
                    if (SS[i][j] == "*") {  SS[i][j] = "0";
                        if (Proverka(SS,4,"0")!=false){
                            k = 1;    j+=1; i+=1;
                            System.out.println("Ход компьютера X: "+ j +" Y:"+ i);
                            i = 5;
                            break; } else {    SS[i][j] = "*";  }
                    }
                }
            }

            if (k ==0){

                for (int i=0;i<5; i++){            // Здесь компьютер ищет варианты победы игрока и подставляет туда 0
                    for (int j=0;j<5; j++){
                        if (SS[i][j] == "*") {  SS[i][j] = "X";
                            if (Proverka(SS, 4, "X") != false) {
                                SS[i][j] = "0";       k = 1;               j+=1; i+=1;
                                System.out.println("Ход компьютера X: "+ j +" Y:"+ i);
                                i = 5;
                                break;    } else {       SS[i][j] = "*";         }
                        }
                    }
                }
            }

            if (k == 0){

                for (;;) {           // если два верхних варианта не сработали компьютер в случайном порядке ставит 0
                    int tx = pc.nextInt(5);
                    int ty = pc.nextInt(5);
                    if (SS[tx][ty] == "*") {  SS[tx][ty] = "0";
                        tx+=1;  ty+=1;
                        System.out.println("Ход компьютера X: "+ ty +" Y:"+ tx);
                        break; }
                }
            }
            System.out.println();
        }
    }

    public static void MS(String[][] SS) {   // вывод массива на экран
        int x = SS.length;
        System.out.println("   1 2 3 4 5 x");
        for (int i = 0; i < x; i++) {
            System.out.print(i + 1 + "  ");
            for (int j = 0; j < x; j++) {
                System.out.print(SS[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("y");

    }   // // вывод массива на экран
    public static boolean Proverka(String[][] SS, int Const, String Str) {

        boolean pp = false;

        for (int i = 0; i < 5; i++) {
            int xx = 0;
            int yy = 0;

            for (int j = 0; j < 5; j++) {

                if (SS[j][i] == Str) { xx += 1; } else {  xx = 0;   }
                if (SS[i][j] == Str) { yy += 1; } else {  yy = 0;   }
                if (xx == Const || yy == Const) {  pp = true;   break;     }
            }
        }

        for (int i = -1; i < 2; i++) {
            int xy = 0;
            int yx = 0;

            for (int j = 0; j < 5; j++) {

                if (((j + i) >= 0) && ((j + i) < 5)) {
                    if (SS[j + i][j] == Str) {  xy += 1; } else {  xy = 0; }      }

                if (((4 - j + i) >= 0) && ((4 - j + i) < 5)) {
                    if (SS[4 - j + i][j] == Str) {   yx += 1;  } else {   yx = 0;  }   }

                if (xy == Const || yx == Const) { pp = true;   break;   }

            }
        }

        return pp;

    }   // проверка массвива количества символов в строках
}
