class Bank {
    private double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: " + balance);
        }
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class CustomExceptionExample2 {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        try {
            myBank.withdraw(6000); // Will throw exception
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
