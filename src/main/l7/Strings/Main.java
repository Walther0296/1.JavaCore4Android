package main.l7.Strings;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat cat = new Cat("Мурзик");
        Plate.printPlate();

        cat.eat(plate);
        Plate.printPlate();


    }
}