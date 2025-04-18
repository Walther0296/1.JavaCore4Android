package main.l6.OOP2;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Тошка");
        Dog dog2 = new Dog("Дружок");

        cat.run(170);
        dog2.run(480);
        cat.swim(30);
        dog2.swim(4);


        System.out.println(Dog.getCount());
        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());

    }
}
