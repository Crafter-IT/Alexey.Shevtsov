package ru.geekbrains.java1.lesson7;

public class Cat {

        private String name ;
        private int appetite ;
        private boolean Kitekat;

        public Cat ( String name , int appetite ) {
            this.name = name;
            this.appetite = appetite;
        }

    public void eat ( Plate p ) {
        if ((p.getFood() - appetite) >=0){
            p.decreaseFood ( appetite );
            Kitekat = true;
            appetite = 0;
        }
    }

    public void satiety() { System.out.println("Кот "+ name + " насытился: " +  Kitekat); }
}
