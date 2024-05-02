package objectAdapter.adaptees;

import java.time.LocalDateTime;
import java.util.Random;

public class StripeProcessor {
    private String transactionID;
    private Double amount;

    public void createPayment(double amount) {
        System.out.println( "[" + this.getClass().getCanonicalName() + "] created the payment with amount R$" + amount + " in " + LocalDateTime.now());
    }

    public void capturePayment(String transactionID) {
        System.out.println("[" + this.getClass().getCanonicalName() + "] the transaction " + transactionID + " captured in " + LocalDateTime.now());
    }

    public String getPaymentStatus(String transactionID) {
        Random random = new Random();
        String response = "[" + this.getClass().getCanonicalName() + "] the transaction " + transactionID + " got status ";
        return response + ((random.nextInt(6) / 2) == 0 ? "\"finished\"" : "\"processing\"") + " in " + LocalDateTime.now();
    }
}
