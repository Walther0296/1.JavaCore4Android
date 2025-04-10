package main.l5.OOP;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
// Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Ivan", "Doctor", "ivivan@mailbox.com", "892312312", 30000, 41);
        persArray[2] = new Person("Sidorov Ivan", "Policeman", "ivivan@mailbox.com", "892312312", 30000, 52);
        persArray[3] = new Person("Maximov Ivan", "Driver", "ivivan@mailbox.com", "892312312", 30000, 39);
        persArray[4] = new Person("Izmailov Ivan", "Manager", "ivivan@mailbox.com", "892312312", 30000, 54);
        // потом для каждой ячейки массива задаем объект persArray[1] = new Person(...); ... persArray[4] = new Person(...);

        persArray[1].printInfo();

        }
    }