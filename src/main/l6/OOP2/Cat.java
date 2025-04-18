package main.l6.OOP2;

public class Cat extends Animal {

    private static int count;

    public Cat(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        if (distance < 200 & distance > 0) {

            System.out.println("Кот " + name + " пробежал " + distance + " метров.");
        } else {
            System.out.println("Кот " + name + " не бежал!");
        }
    }

    public void swim(int distance) {

        System.out.println("Коты плавать не умеют, вот и кот " + name + " не проплыл " + distance + " метров.");

    }


}