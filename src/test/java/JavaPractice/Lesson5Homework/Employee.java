package JavaPractice.Lesson5Homework;

public class Employee {

    String surName;
    int id;
    int age;
    double salary;
    String department;

    Employee(int id1, int age1, String surname1, double salary1, String department1) {
        id = id1;
        age = age1;
        surName = surname1;
        salary = salary1;
        department = department1;
    }

    double bonusSalary() {
        double sum = salary * 2;
        return sum;
    }
}

    class EmployeeTest {
        public static void main(String[] args) {


            Employee mihai = new Employee(1, 30, "B", 2000, "IT");
            Employee karina = new Employee(2, 27, "O", 5000, "Consulting");
            Employee viktor = new Employee(1, 44, "C", 2305.94, "Sales");
            Employee svetlana = new Employee(3, 21,  "P", 1346.65, "HR");

            System.out.println(karina.bonusSalary());
            System.out.println(mihai.bonusSalary());
            System.out.println(svetlana.bonusSalary());
            System.out.println(viktor.bonusSalary());



        }

        // Just added
    }


