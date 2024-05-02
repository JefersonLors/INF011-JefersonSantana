package objectAdapter.adapters;

import objectAdapter.adaptees.StripeProcessor;
import objectAdapter.target.PayPalPaymentProcessor;

public class StripeProcessorAdapter implements PayPalPaymentProcessor {
    private StripeProcessor stripeProcessor;

    public StripeProcessorAdapter(StripeProcessor stripeProcessor){
        this.stripeProcessor = stripeProcessor;
    }
    @Override
    public void initiatePayment(double amount) {
        this.stripeProcessor.createPayment(amount);
    }

    @Override
    public void processPayment(String transactionID) {
        this.stripeProcessor.capturePayment(transactionID);
    }

    @Override
    public String checkPaymentStatus(String transactionID) {
        return this.stripeProcessor.getPaymentStatus(transactionID);
    }
}
