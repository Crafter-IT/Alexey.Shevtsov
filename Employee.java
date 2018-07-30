package ru.geekbrains.java1.lesson1;

public class Employee {

    private String FIO;
    private String Dolzh;
    private String email;
    private int Phone;
    private int ZP;
    private int Age;

    public static void main(String[] args) {

        Employee[] A = new Employee[5];
        A[0] = new Employee("Petrov Petr Petrovich", "Director", "Petrov01@gmail.com", 12 - 23 - 55, 300000, 45);
        A[1] = new Employee("Sidorov Sergey Ivavovich", "Head of Department", "Sidorov5@mail.ru", 12 - 22 - 51, 98500, 34);
        A[2] = new Employee(" Alexandrovich", "Trainee", "Grachev-Viktor@gmail.com", 12 - 05 - 03, 45000, 41);
        A[3] = new Employee("Vasinov Vlad Sergeevich", "Chief Specialist", "Vasinov77@gmail.com", 05 - 04 - 77, 55000, 51);
        A[4] = new Employee("Pupkin Ivan Andreevich", "Specialist", "Pupkin-88@gmail.com", 777, 35500, 25);


        for (int i = 0; i < A.length; i++) {
            if (A[i].getAge() > 40) {
                A[i].Employee();
            }
        }
    }

    

    public Employee(String Familia, String Position, String email, int phone, int salary, int Age) {
        this.FIO = Familia;
        this.Dolzh = Position;
        this.email = email;
        this.Phone = phone;
        this.ZP = salary;
        this.Age = Age;
    }

    public void Employee() {
        System.out.println("Фамилия: " + FIO + " Должность: " + Dolzh + " Почта: " + email + " Телефон: " + Phone + " Зарплата: " + ZP + " Возраст: " + Age);
    }

    public int getAge() {
        return Age;
    }
}
