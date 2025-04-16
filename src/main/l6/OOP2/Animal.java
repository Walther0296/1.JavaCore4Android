package main.l6.OOP2;

public class Animal {
    String name;
    int distance;


    public Animal(String name) {
        this.name = name;
        this.distance = distance;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " метров.");
    }

    public void swim (int distance){
        System.out.println("Животное проплыло " + distance + " метров");
    }
}
