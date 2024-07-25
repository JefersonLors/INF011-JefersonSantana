package classAdapter.target;

public interface PayPalPaymentProcessor {
    void initiatePayment();
    void processPayment();
    String checkPaymentStatus();
}
