package classAdapter.target;

public interface PayPalPaymentProcessor {
    void initiatePayment(double amount);
    void processPayment(String transactionID);
    String checkPaymentStatus(String transactionID);
}
