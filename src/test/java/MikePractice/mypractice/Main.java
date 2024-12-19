package MikePractice.mypractice;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Developer developer = new Developer("David", "H", "Dev Lead", 240000, 2.5, "USA");
//        Developer developer1 = new Developer("Rae", "V", "Dev", 186000, 1.5, "USA");
//        Developer developer2 = new Developer("Alejandro", "M", "Dev", 170000, 4, "Costa Rica");
//
//        Tester qa1 = new Tester("Diego", "R", "QA", 110000, 4.75, "Costa Rica");
//        Tester qa2 = new Tester("Sowmi", "R", "QA", 140000, 1.5, "USA");
//
//        ProductOwner po1 = new ProductOwner("Ric", "H", "PO", 155000, 2.75, "USA");
//        ProductOwner po2 = new ProductOwner("Harry", "M", "PO", 100000, 6.75, "Costa Rica");
//        ProductOwner po3 = new ProductOwner("Emma", "O", "PO", 134524, 1, "USA" );
//
//
//        Employee[] employees = {developer, developer1, developer2};


         List<Employee> employeesNewTeam = Utils.createdTestersTeam();
         Utils.printEmployeeList(employeesNewTeam);

         Tester tester = new Tester("Arty", "R", "QA", 125613, 2.5, "USA");

         Utils.addEmployeeToTheTeam(employeesNewTeam, tester);

         System.out.println("*************");
         Utils.printEmployeeList(employeesNewTeam);





    }

}




