abstract class Payment {
    abstract void processPayment(double amount);

    void paymentStatus() {
        System.out.println("Payment Status:");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of rupees " + amount);
    }

    void paymentStatus() {
        super.paymentStatus();
        System.out.println("Credit Card payment processed successfully.");
    }
}

class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of rupees " + amount);
    }

    void paymentStatus() {
        super.paymentStatus();
        System.out.println("PayPal payment processed successfully.");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        
        PayPalPayment ppp = new PayPalPayment();
        ppp.processPayment(200.0);
        ppp.paymentStatus();

        Payment p = new CreditCardPayment();
        p.processPayment(300.0);
        p.paymentStatus();

        
    }
}