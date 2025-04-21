package main.l7.Strings;

public class Plate {
    static int plate;

    public Plate(int plate) {
        this.plate = plate;
    }

    public int getPlate() {
        return plate;
    }

    public static void printPlate() {
        System.out.println("В тарелке " + plate + " граммов еды.");
    }

    public void decreaseFood(int foodToDecrease) {
        plate -= foodToDecrease;
        printPlate();
    }

    void increaseFood() {
        this.plate += 400;
        System.out.println("В миску добавили 400 грамм корма");
    }

    boolean checkFood(int foodToDecrease) {
        return (plate - foodToDecrease) >= 0;
    }
}

