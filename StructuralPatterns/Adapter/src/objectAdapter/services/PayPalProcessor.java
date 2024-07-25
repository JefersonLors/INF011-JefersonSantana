package objectAdapter.services;

import objectAdapter.target.PayPalPaymentProcessor;

import java.time.LocalDateTime;
import java.util.Random;

public class PayPalProcessor implements PayPalPaymentProcessor {
    private String transactionID;
    private Double amount;

    public PayPalProcessor(String transactionID, double amount){
        this.transactionID = transactionID;
        this.amount = amount;
    }

    @Override
    public void initiatePayment() {
        System.out.println( "[" + this.getClass().getCanonicalName() + "] started the payment with amount R$" + this.amount + " in " + LocalDateTime.now());
    }

    @Override
    public void processPayment() {
        System.out.println("[" + this.getClass().getCanonicalName() + "] the transaction " + this.transactionID + " process began in " + LocalDateTime.now());
    }

    @Override
    public String checkPaymentStatus() {
        Random random = new Random();
        String response = "[" + this.getClass().getCanonicalName() + "] the transaction " + this.transactionID + " status was ";
        return response + ((random.nextInt(6) / 2) == 0 ? "\"finished\"" : "\"processing\"") + " in " + LocalDateTime.now();
    }
}
