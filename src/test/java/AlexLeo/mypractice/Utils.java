package AlexLeo.mypractice;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Employee> createdTestersTeam(){

//        Tester qa1 = new Tester("Diego", "R", "QA", 110000, 4.75, "Costa Rica");
//        Tester qa2 = new Tester("Sowmi", "R", "QA", 140000, 1.5, "USA");
//        Manager manager = new Manager("Scott", "R", "QAManager", 15000, 5.75, "USA");

        List<Employee> testersTeam = new ArrayList<>();
//        testersTeam.add(qa1);
//        testersTeam.add(qa2);
//        testersTeam.add(manager);
        return testersTeam;
    }

    public static List<Employee> addEmployeeToTheTeam(List<Employee> employees, Employee employee){
        employees.add(employee);
        return employees;
    }


    public static void printEmployeeList(List<Employee> employees){
        for(Employee employee : employees){
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
    }


 // methods to add/remove people from the List
// Created 3 methods: return the QA team under QA management, return Dev's under Developer management
 // and a method for PO's with PO management

 // Create a method that will be named Delivery Manager, and it will return all the managers

// Method for Managers of each Team to get a bonus every quarter of %17 from each worker, if worker has at least 1,5 years in the company

// Method for Delivery Manager if Every manager is with the company for at least 1 year, and each team individual

// managed by him is working at least 2 years in the company

// Return methods based on Country origin that will separate the tax payment:
// Costa Rica team will pay %21 of its gross salary, while US team will pay %27 if salary is less than 100k, %35 if up to 160k

//??? How to create constructors for managers that will have only QA in the team ( same for DEVs and POs)

}
