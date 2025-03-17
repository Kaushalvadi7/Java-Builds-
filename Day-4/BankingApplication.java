import java.util.Scanner;

class InsufficientBalanceException extends Exception 
  // indicate the Our Custom Exception is Compile Time Exception(Checked Exception)
{ 
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;
    
    public BankAccount() {
        this.balance = 0.0;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            throw new InsufficientBalanceException("Insufficient balance or invalid withdrawal amount.");
        }
    }
    
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        
        while (true) {
            try {
                System.out.println("\nBanking System:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                
                int choice = scanner.nextInt();
                scanner.close();
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        try {
                            account.withdraw(withdrawAmount);
                        } catch (InsufficientBalanceException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 3:
                        account.checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using our banking system.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
