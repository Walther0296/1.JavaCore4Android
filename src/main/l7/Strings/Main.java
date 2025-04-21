package main.l7.Strings;

public class Main {
    private static int TIME = 0;

    public static void main(String[] args) {
        Plate plate = new Plate(700);

        Cat[] cat = new Cat[6];
        cat[0] = new Cat("Мурзик", 300, 3);
        cat[1] = new Cat("Тошик", 300, 2);
        cat[2] = new Cat("Муся", 200, 4);
        cat[3] = new Cat("Коржик", 100, 2);
        cat[4] = new Cat("Кузя", 200, 5);
        cat[5] = new Cat("Чуб", 300, 1);
        System.out.println("Сейчас в миске " + plate.getPlate() + " грамм кошачьего корма.\n");


        do {
            for (Cat i : cat) {

                //если кот голоден
                if (i.getSatiety() == 0) {

                    //если в миске не хватает еды, чтобы накормить кота, она будет добавлена
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    //кот ест
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety()) + " часа(ов)");
                }

                //декрементация показателя сытости
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nС момента начала кормежки прошел(ло) " + TIME + " час(а). В миске осталось " + plate.getPlate() + " граммов корма.\n");
            TIME++;

        } while (TIME <= 24);
    }
}