abstract class Payment {
    private double amount; 
    
    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    abstract void processPayment();
}

// Credit Card Payment Class
class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }


    @Override
    void processPayment() {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Amount: $" + getAmount());
        System.out.println("Card Number (last 4 digits): ****" + cardNumber.substring(cardNumber.length() - 4));
    }
}

// UPI Payment Class
class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI Payment...");
        System.out.println("Amount: $" + getAmount());
        System.out.println("UPI ID: " + upiId);
    }
}

// Main class
public class PaymentGateway {
    public static void main(String[] args) {

        // Ccp Example
        Payment creditCardPayment = new CreditCardPayment(1000, "1234567812345678");
        creditCardPayment.processPayment();

        System.out.println(); // Just for spacing

        // UPI Payment Example
        Payment upiPayment = new UPIPayment(500, "kaushal@okaxis");
        upiPayment.processPayment();
    }
}
