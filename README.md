# Alexey.Shevtsov
lesson 7 Home Task

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
