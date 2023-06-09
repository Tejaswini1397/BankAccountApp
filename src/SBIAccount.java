import java.time.Year;
import java.util.UUID;

public class SBIAccount implements BankAccountInterface {
    private String name;
    private String accounts; //random number
    private double balance;
    private String password;
    final double Interest=6.1;

    public SBIAccount(String name) {

    }
    public SBIAccount(String name,double balance, String password) {
        this.name = name;
        this.accounts = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String fetchBalance(String password) {
       if(this.password.equals(password)){
           return "Your current balance is :"+ this.balance;
       }
        return "Incorrect Password";
    }

    @Override
    public double addMoney(double amount) {
        this.balance+=amount;
        return balance;
    }

    @Override
    public String withdrawMoney(String password, double amount) {
        if(this.password.equals(password)) {
            if (amount <= this.balance) {
                this.balance -= amount;
                return "Your remaining balance is :" + this.balance;
            } else {
                return "Insufficient Balance";
            }
        }
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if(this.password.equals(oldPassword)){
            this.password=newPassword;
            return "Congregates Your Password is Successfully Updated";
        }
        return "Incorrect Password";
    }

    @Override
    public double calculateInterest(int years) {
        return (this.balance*Interest* years)/100;
    }
}
