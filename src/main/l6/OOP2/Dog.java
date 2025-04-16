package main.l6.OOP2;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void run(int distance) {
        if (distance < 500 & distance > 0) {

            System.out.println("Пес " + name + " пробежал " + distance + " метров.");
        } else {
            System.out.println("Пес " + name + " не бежал!");
        }
    }


}