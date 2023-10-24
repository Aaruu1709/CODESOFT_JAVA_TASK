import java.util.Scanner;

class ATM {
    private double balance;

    public ATM(double initialBalance) {
        balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Your balance: rs." + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("rs" + amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("rs" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

public class AtmInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************************************************");
        
        System.out.println("______________________Welcome to the ATM!__________________________");

        System.out.println("***********************************************************************");

        System.out.print("Enter your initial balance: rs");
        double initialBalance = scanner.nextDouble();

        ATM atm = new ATM(initialBalance);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter the deposit amount: rs.");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter the withdrawal amount: rs.");

                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
// This code represents a simplified ATM system where we can check your balance, 
// deposit money,
//  and withdraw money.
//   It's a  program that should help you understand the basic structure of such a particular ATM SYSTEM.