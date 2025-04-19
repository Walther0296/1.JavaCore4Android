package main.l7.Strings;

public class Plate {
static int plate;

    public Plate(int plate) {
        this.plate = plate;
    }

    public int getPlate() {
        return plate;
    }

    public static void printPlate(){
        System.out.println("В тарелке " + plate + " единиц еды.");
    }

    public void decreaseFood(int foodToDecrease){
        plate -= foodToDecrease;
    }
}
