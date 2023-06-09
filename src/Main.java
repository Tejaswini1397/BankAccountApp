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

        //-------------------------------------------------------------------------------------//
        //HDFC BANK ACCOUNT
        HDFCAccount hdfcAccount1=new HDFCAccount("Teju",10000,"123456");
        System.out.println("Congrats! "+hdfcAccount1.getName() + " Account has been created "+ hdfcAccount1.getAccount() );

        HDFCAccount hdfcAccount2=new HDFCAccount("Nita",20000,"12345678");
        System.out.println("Congrats! "+hdfcAccount2.getName()+ " Account has been created " +hdfcAccount2.getAccount());

        //addmoney
        System.out.println(hdfcAccount1.addMoney(2000000));
        System.out.println(hdfcAccount2.addMoney(3000000));

        //change pass
        System.out.println(hdfcAccount1.changePassword("12398","123456"));

        //withrdraw money
        System.out.println(hdfcAccount2.withdrawMoney("12345678",200000));

        //fech balance
        System.out.println(hdfcAccount1.fetchBalance("12398"));
        System.out.println(hdfcAccount2.fetchBalance("12345678"));
        //Integrest
        System.out.println("Enter years you want to calculate");
        int y=sc.nextInt();
        System.out.println(hdfcAccount1.calculateInterest(y));
        System.out.println(hdfcAccount2.calculateInterest(y));




    }
}