package main.l6.OOP2;

public abstract class Animal {
    String name;
    private static int count;    // счетчик количества созданных животных (в том числе клонированных) не стал тут разделять.

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }


    public void run(int distance) {
    }

    public void swim(int distance) {
    }

}
