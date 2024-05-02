package classAdapter.adaptees;

import java.time.LocalDateTime;
import java.util.Random;

public class StripeProcessor {
    private String transactionID;
    private Double amount;

    public void createPayment(double amount) {
        System.out.println( "[" + this.getClass().getCanonicalName() + "] started the payment with amount: R$" + amount);
    }

    public void capturePayment(String transactionID) {
        System.out.println("[" + this.getClass().getCanonicalName() + "] the transaction " + transactionID + " started in " + LocalDateTime.now());
    }

    public String getPaymentStatus(String transactionID) {
        Random random = new Random();
        String response = "[" + this.getClass().getCanonicalName() + "] the transaction " + transactionID + " status is ";
        return response + ((random.nextInt(6) / 2) == 0 ? "finished " : "processing");
    }
}
