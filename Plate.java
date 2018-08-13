package ru.geekbrains.java1.lesson7;

import java.util.Scanner;

public class Plate {
    private int food;
    private Scanner y = new Scanner(System.in);

    public Plate(int food) {
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
