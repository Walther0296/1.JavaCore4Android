package main.l6.OOP2;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void run(int distance) {
        if (distance < 200 & distance > 0) {

            System.out.println("Кот " + name + " пробежал " + distance + " метров.");
        } else {
            System.out.println("Кот " + name + " не бежал!");
        }
    }


}