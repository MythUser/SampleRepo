package MikePractice.mypractice;

public class Employee {

   private final String firstName;
   private final String lastName;
   private final String title;
   private final double salary;
   private final double workingYears;
   private final String country;

    Employee(String firstName1 , String lastName1, String title1 , double salary1, double workingYears1, String country1 ) {
        this.firstName = firstName1;
        this.lastName = lastName1;
        this.title = title1;
        this.salary = salary1;
        this.workingYears = workingYears1;
        this.country = country1;
    }

   public String getFirstName(){
        return firstName;
   }

   public String getLastName(){
        return lastName;
   }

   public String getTitle(){
        return title;
   }

   public double getSalary(){
        return salary;
   }

   public double getWorkingYears(){
        return workingYears;
   }

   public String getCountry(){
        return country;
   }
}
