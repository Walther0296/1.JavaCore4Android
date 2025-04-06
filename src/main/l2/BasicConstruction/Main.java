package main.l2.BasicConstruction;

public class Main {
    public static void main(String[] args) {
        // check();
        check2();
    }

    // 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (
    //   включительно), если да – вернуть true, в противном случае – false.


    public static void check() {
        int a = 5;
        int b = 2;
        int sum = a + b;
        System.out.println(sum <= 20 & sum >= 10);
    }

    // 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //   положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void check2() {
        int a = -9;
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

}