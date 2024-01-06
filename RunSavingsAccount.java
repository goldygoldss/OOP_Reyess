package runsavingsaccount;
import java.util.Scanner;

public class RunSavingsAccount {

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Interest Rate: ");
        double interestRate = input.nextDouble();
        SavingsAccount.setInterestRate(interestRate);

        System.out.print("Enter Deposit Amount: ");
        double amount = input.nextDouble();
        savings.deposit(amount);
       
        System.out.println("Your Balance Is "+ amount);
        
        char choice;
        do {
            System.out.print("Press D For Another Deposit, W For Withdraw: ");
            choice = input.next().charAt(0);
            if (choice == 'D' || choice == 'd') {
                System.out.print("Enter Deposit Amount: ");
                amount = input.nextDouble();
                savings.deposit(amount);
            } else if (choice == 'W' || choice == 'w') {
                System.out.print("Enter The Amount To Be Withdraw: ");
                amount = input.nextDouble();
                savings.withdraw(amount);
            }
            SavingsAccount.showBalance(savings);
        } while (choice == 'D' || choice == 'd' || choice == 'W' || choice == 'w');
    }
}
