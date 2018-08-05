package ru.geekbrains.java1.lesson1;

import java.util.Random;

public class Walk {

    public static void main(String[] args) {

        Random x = new Random();

        Cat[] Cats = new Cat[5];
        Doc[] Docs = new Doc[5];

        for (int i =0; i<5 ; i++ ) {
            int xx = x.nextInt(150);
            int zz = x.nextInt(50);
            int yy = x.nextInt(10);;

            Cats[i] = new Cat(100+xx,zz,yy);
            Docs[i] = new Doc(300+xx,7+zz,yy);
        }

        for (int i =0; i<5 ; i++ ) {
            int xx = x.nextInt(650);
            int zz = x.nextInt(60);
            int yy = x.nextInt(20);;

            System.out.println();
            System.out.println("Замер характеристик кошек");
            System.out.println();

            Cats[i].Run(xx);
            Cats[i].Swim(yy);
            Cats[i].Jump(zz);

            System.out.println();
            System.out.println("Замер характеристик собак");
            System.out.println();

            Docs[i].Run(xx);
            Docs[i].Swim(yy);
            Docs[i].Jump(zz);

        }

    }
}
