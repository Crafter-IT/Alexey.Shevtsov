package ru.geekbrains.java1.lesson7;

public class CatPlate {


    public static void main ( String [] args ) {
        Cat[] cat = new Cat[5];

        cat[0] = new Cat("Felix" , 9);
        cat[1] = new Cat("Boris" , 7);
        cat[2] = new Cat("Murka" , 2);
        cat[3] = new Cat("Barsik" , 11);
        cat[4] = new Cat("Markus" , 5);

        Plate plate = new Plate ( 17 );

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
