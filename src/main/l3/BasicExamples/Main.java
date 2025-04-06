package main.l3.BasicExamples;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // changeArray();
        // arrHundred();
        // thirdTask();
        // fourthTask(25);
        // fifthTask(4, 4);
        // sixthTask();
        // seventhTask(new int[]{3, 5, 3, 2, 6, 2, 1});
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
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == j) || (i + j == (a - 1))) {
                    System.out.print(arr[i][j] = 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

// 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int
//   длиной len, каждая ячейка которого равна initialValue;

    private static void fifthTask(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 6.* Задать одномерный массив и найти в нем минимальный и максимальный элементы;

    private static void sixthTask() {
        int[] arr = {1, 3, 5, 6, 8, 4, 5, 7, 10, 14, 356, 5, 7};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);

    }
    // 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в
    //   массиве есть место, в котором сумма левой и правой части массива равны.
    //   **Примеры:
    //   checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    //   checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    //
    //граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

    private static void seventhTask(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum % 2 == 0);
    }

    // 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
    //   отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для
    //   усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один
    //   вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг
    //   можете выбирать сами.
    //   Если выполнение задач вызывает трудности, можете обратиться к последней странице методического пособия. Для задач
    //   со * не нужно искать решение в интернете, иначе нет смысла их выполнять.

    private static void eighthTask (int [] arr, int n){

    }

}