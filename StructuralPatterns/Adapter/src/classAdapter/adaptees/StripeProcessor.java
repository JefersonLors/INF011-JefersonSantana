package classAdapter.adaptees;

import java.util.Random;

public class StripeProcessor {
    public StripeProcessor(){}
    public void createPayment(double amount) {
        System.out.println( "[" + this.getClass().getCanonicalName() + "] created the payment with amount R$" + amount);
    }

    public void capturePayment(String transactionID) {
        System.out.println("[" + this.getClass().getCanonicalName() + "] the transaction " + transactionID + " processing...");
    }

    public String getPaymentStatus(String transactionID) {
        Random random = new Random();
        String response = "[" + this.getClass().getCanonicalName() + "] the transaction " + transactionID + " got status ";
        return response + ((random.nextInt(6) / 2) == 0 ? "\"finished\"" : "\"processing\"");
    }
}
