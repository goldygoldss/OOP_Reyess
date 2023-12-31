package runsavingsaccount;

public class SavingsAccount {

    private double balance;
    public static double interestRate;

    public SavingsAccount() {
        balance = 0;
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            amount = 0;
        }
        return amount;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        
    }

    public static void showBalance(SavingsAccount account) {
        double balance = account.getBalance();
        
        
        if (balance > 500) {
            account.addInterest();
            balance = account.getBalance();    
        }
        
        else if (balance > 1000) {
            account.addInterest();
            balance = account.getBalance();
        
        }
        System.out.println("Your Balance Is: " + balance);
    }
}