package main.l1.Introduction;


public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();

    }


    //2. Создан метод printThreeWords(), который при вызове выводит в столбец три слова:
    //   Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.printf("Orange\n" +
                "Banana\n" +
                "Apple");
        System.out.println();
    }

    ;

    //Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
    //   и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если
    //   их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма
    //   отрицательная”;
    public static void checkSumSign() {
        int a = 9;
        int b = 3;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    };


}