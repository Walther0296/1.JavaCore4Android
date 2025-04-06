package main.l3.BasicExamples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // changeArray();
        // arrHundred();
        // thirdTask();
        fourthTask(9);
    }

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью
    //   цикла и условия заменить 0 на 1, 1 на 0;
    private static void changeArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    private static void arrHundred() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;

    private static void thirdTask() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    //   заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы
    //   одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то
    //   есть [0][0], [1][1], [2][2], …, [n][n];

    private static void fourthTask(int a) {
        int[][] table = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == j) || (i+j==(a-1))) {
                System.out.print(table[i][j] = 1);
            }
            else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }

    }

}