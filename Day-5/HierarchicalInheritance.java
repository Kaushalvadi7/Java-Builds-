// Parent class
class BankAccount {
    void accountType() {
        System.out.println("This is a bank account");
    }
}

// Child class 1
class SavingsAccount extends BankAccount {
    void interestRate() {
        System.out.println("Savings account has an interest rate of 5%");
    }
}

// Child class 2
class CurrentAccount extends BankAccount {
    void overdraftLimit() {
        System.out.println("Current account has an overdraft limit of $1000");
    }
}

// Main class
public class HierarchicalInheritance {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.accountType();
        savings.interestRate();

        CurrentAccount current = new CurrentAccount();
        current.accountType();
        current.overdraftLimit();
    }
}
