package classAdapter.adapters;

import classAdapter.adaptees.StripeProcessor;
import classAdapter.target.PayPalPaymentProcessor;

public class StripeProcessorAdapter extends StripeProcessor implements PayPalPaymentProcessor {
    @Override
    public void initiatePayment(double amount) {
        createPayment(amount);
    }

    @Override
    public void processPayment(String transactionID) {
        capturePayment(transactionID);
    }

    @Override
    public String checkPaymentStatus(String transactionID) {
        return getPaymentStatus(transactionID);
    }
}
