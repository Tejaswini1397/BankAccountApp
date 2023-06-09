public interface BankAccountInterface {
    public String fetchBalance(String password);

    public double addMoney(double amount);

    public String withdrawMoney(String password, double amount);

    String changePassword(String newPassword, String oldPassword);

    double calculateInterest(int years);

}
