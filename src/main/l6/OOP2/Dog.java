package main.l6.OOP2;

public class Dog extends Animal {

    private static int count;

    public static int getCount() {
        return count;
    }

    public Dog(String name) {
        this.name = name;
        count++;
    }

    public void run(int distance) {
        if (distance < 500 & distance > 0) {

            System.out.println("Пес " + name + " пробежал " + distance + " метров.");
        } else {
            System.out.println("Пес " + name + " не бежал!");
        }
    }

    public void swim(int distance) {
        if (distance < 10 & distance > 0) {

            System.out.println("Пес " + name + " проплыл " + distance + " метров.");
        } else {
            System.out.println("Пес " + name + " не плыл!");
        }
    }


}