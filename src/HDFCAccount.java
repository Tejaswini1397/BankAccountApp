import com.sun.security.auth.UnixNumericUserPrincipal;

import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{
    private String name;
    private String account;
    private double balance;
    private String password;
    final double Interest=6.1;

    public HDFCAccount(String name) {

    }

    public HDFCAccount(String name, double balance, String password) {
        this.name = name;
        this.account = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
            return "Your Balance is :"+this.balance;
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
        if(this.password.equals(password)){
            if(amount<this.balance){
                this.balance-=amount;
                return "Your remaining balance is :"+this.balance;
            }else{
                return "In sufficient balance";
            }
        }
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if(this.password.equals(oldPassword)){
            this.password=newPassword;
            return " Congrats ! Your password has been update";
        }
        return "Incorrect Password";
    }

    @Override
    public double calculateInterest(int years) {
        return (this.Interest*this.balance*years)/100;
    }
}
