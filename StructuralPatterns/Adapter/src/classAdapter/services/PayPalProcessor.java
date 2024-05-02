package classAdapter.services;

import classAdapter.target.PayPalPaymentProcessor;

import java.time.LocalDateTime;
import java.util.Random;

public class PayPalProcessor implements PayPalPaymentProcessor {
    private String transactionID;
    private Double amount;

    @Override
    public void initiatePayment(double amount) {
        System.out.println( "[" + this.getClass().getCanonicalName() + "] started the payment with amount: R$" + amount);
    }

    @Override
    public void processPayment(String transactionID) {
        System.out.println("[" + this.getClass().getCanonicalName() + "] the transaction " + transactionID + " started in " + LocalDateTime.now());
    }

    @Override
    public String checkPaymentStatus(String transactionID) {
        Random random = new Random();
        String response = "[" + this.getClass().getCanonicalName() + "] the transaction " + transactionID + " status is ";
        return response + ((random.nextInt(6) / 2) == 0 ? "finished " : "processing");
    }
}
