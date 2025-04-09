package main.l5.OOP;

public class Employee {
    // 1. Создать класс ""Сотрудник"" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    //Конструктор класса должен заполнять эти поля при создании объекта.

    String name;
    String position;
    String email;
    String tel;
    int salary;
    int age;

    public Employee(String name, String position, String email, String tel, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name);
    }
}
