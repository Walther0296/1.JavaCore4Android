package main.l7.Strings;

import java.security.PublicKey;
import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat (Plate plate){
        int appetite = 5 + ThreadLocalRandom.current().nextInt(25);
        System.out.println("Текущий аппетит кота " + appetite);
        plate.decreaseFood(appetite);
    }
}
