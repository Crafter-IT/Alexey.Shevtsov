# Alexey.Shevtsov
lesson 7 Home Task
-------------------------

package ru.geekbrains.java1.lesson1;

public class HomeCat {

    private String name ;
    private int appetite ;
    private boolean Kitekat;

    public HomeCat ( String name , int appetite ) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat ( HomePlate p ) {
        if ((p.getFood() - appetite) >=0){
            p.decreaseFood ( appetite );
            Kitekat = true;
            appetite = 0;
        }
    }

    public void satiety() { System.out.println("Кот "+ name + " насытился: " +  Kitekat); }

}



---------------------------------------------------------------



package ru.geekbrains.java1.lesson1;

import java.util.Scanner;

public class HomePlate {


    private int food;
    private Scanner y = new Scanner(System.in);

    public HomePlate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }


    public void decreaseFood(int n) { food -= n;  }

    public void addFood(int addFood){ food += addFood; }

    public int getFood() {  return food;  }

    public void FoodAdd() {
        System.out.print("Укажите сколько еды хотите добавить в тарелку: ");
        int foodadd = y.nextInt();
        food += foodadd;
    }

}


----------------------------------------------------------

package ru.geekbrains.java1.lesson1;

public class HomeCatPlate {


    public static void main ( String [] args ) {
        HomeCat[] cat = new HomeCat[5];

        cat[0] = new HomeCat("Felix" , 9);
        cat[1] = new HomeCat("Boris" , 7);
        cat[2] = new HomeCat("Murka" , 2);
        cat[3] = new HomeCat("Barsik" , 11);
        cat[4] = new HomeCat("Markus" , 5);

        HomePlate plate = new HomePlate ( 17 );

        plate.info ();

        for ( int i=0; i<5; i++ ){
            plate.FoodAdd();
            cat[i].eat (plate);
            plate.info ();

        }


        for ( int i=0; i<5; i++ ){
            cat[i].satiety();
        }
        plate.info ();

    }


}

