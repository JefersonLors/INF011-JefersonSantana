package classAdapter.adapters;

import classAdapter.adaptees.StripeAdvancedProcessor;
import classAdapter.target.PayPalPaymentProcessor;

public class StripeAdvancedProcessorAdapter extends StripeAdvancedProcessor implements PayPalPaymentProcessor {
    private String transactionID;
    private Double amount;

    public StripeAdvancedProcessorAdapter(String transactionID, double amount){
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
