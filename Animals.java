package ru.geekbrains.java1.lesson1;

public abstract class Animals {

    private float run;
    private float swiming;
    private float jump;
    private boolean y;

    public Animals(float MAXrun, float MAXswiming, float MAXjump) {
        this.run = MAXrun;
        this.swiming = MAXswiming;
        this.jump = MAXjump;
    }
    protected void Run(int x) {
        if (x < run) y = true;
        System.out.println("Макстмальное значение дистанции бега: "+ run +", Введенное значение " + x + " : " + y );
    }
    protected void Swim(int x) {
        if (x < swiming) y = true;
        System.out.println("Макстмальное значение дистанции плавания: "+ swiming +", Введенное значение " + x + " : " + y );
    }
    protected void Jump(int x) {
        if (x < jump) y = true;
        System.out.println("Макстмальное значение высоты прыжка: "+ jump +", Введенное значение " + x + " : " + y );
    }
}
