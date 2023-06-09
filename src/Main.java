import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //first SBI account
        SBIAccount account1=new SBIAccount("Tejaswini ",10000,"abc1223");
        System.out.println(" Congrats "+account1.getName()+" Your account has been created "+ account1.getAccounts());

        //second sbi account
        SBIAccount account2=new SBIAccount(" Aman ",2000,"abc");
        System.out.println(" Congrats "+account2.getName()+" Your account has been created "+ account2.getAccounts());

        //addmoney
        System.out.println("Money has been added. New balance is : "+account2.addMoney(100000));

        //withdraw money
        System.out.println(account2.withdrawMoney("123",50000));
        System.out.println(account2.withdrawMoney("abc",50000));

        //fetch balance
        System.out.println(account1.fetchBalance("abc1223"));

        //change pass
        System.out.println(account1.changePassword("abc122356","abc1223"));
        //calculate interest
        System.out.println("Enter number of year to calculate Interest :");
        int years=sc.nextInt();

        System.out.println(" Interest "+ years+ " for is "+ account2.calculateInterest(years));

    }
}