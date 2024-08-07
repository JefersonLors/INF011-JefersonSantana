package classAdapter.adapters;

import classAdapter.adaptees.StripeProcessor;
import classAdapter.target.PayPalPaymentProcessor;

public class StripeProcessorAdapter extends StripeProcessor implements PayPalPaymentProcessor {
    private String transactionID;
    private Double amount;

    public StripeProcessorAdapter(String transactionID, double amount){
        this.transactionID = transactionID;
        this.amount = amount;
    }
    @Override
    public void initiatePayment() {
        this.createPayment(amount);
    }

    @Override
    public void processPayment() {
        this.capturePayment(transactionID);
    }

    @Override
    public String checkPaymentStatus() {
        return this.getPaymentStatus(transactionID);
    }
}
