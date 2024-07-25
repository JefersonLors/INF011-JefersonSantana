package objectAdapter.adapters;

import objectAdapter.adaptees.StripeProcessor;
import objectAdapter.target.PayPalPaymentProcessor;

public class StripeProcessorAdapter implements PayPalPaymentProcessor {
    private StripeProcessor stripeProcessor;
    private String transactionID;
    private Double amount;

    public StripeProcessorAdapter(StripeProcessor stripeProcessor, String transactionID, double amount){
        this.transactionID = transactionID;
        this.amount = amount;
        this.stripeProcessor = stripeProcessor;
    }
    @Override
    public void initiatePayment() {
        this.stripeProcessor.createPayment(amount);
    }

    @Override
    public void processPayment() {
        this.stripeProcessor.capturePayment(transactionID);
    }

    @Override
    public String checkPaymentStatus() {
        return this.stripeProcessor.getPaymentStatus(transactionID);
    }
}
