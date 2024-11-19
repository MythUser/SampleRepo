package JavaPractice.Lesson5Homework;

public class BankAccount {

    String name;
    int id;
    double balance;


    double papalnenieSheta(double add){
        double sum = balance + add;
        return sum;
    }

    double snieatieSheta(double withdraw) {
        double sum = balance - withdraw;
        return sum;
    }
}

class bankAccountTest{

    public static void main(String[] args) {


        BankAccount myAccount = new BankAccount();
        myAccount.name = "Mihai";
        myAccount.id = 1;
        myAccount.balance = 300;

        BankAccount yourAccount = new BankAccount();
        yourAccount.name = "Diego";
        yourAccount.id = 2;
        yourAccount.balance = 500;

        BankAccount herAccount = new BankAccount();
        herAccount.name = "Elena";
        herAccount.id = 3;
        herAccount.balance = 1000;

        System.out.println(myAccount.snieatieSheta(100));
        System.out.println(yourAccount.papalnenieSheta(500));



    }


}
