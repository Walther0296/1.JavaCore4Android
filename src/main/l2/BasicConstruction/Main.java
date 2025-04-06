package main.l2.BasicConstruction;

public class Main {
    public static void main(String[] args) {
        // check();
    }

    // 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (
    //   включительно), если да – вернуть true, в противном случае – false.


    public static void check() {
        int a = 5;
        int b = 2;
        int sum = a + b;
        System.out.println(sum <= 20 & sum >= 10);
    }
}