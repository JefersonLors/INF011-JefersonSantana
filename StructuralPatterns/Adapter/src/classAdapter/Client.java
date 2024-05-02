package classAdapter;

import classAdapter.adapters.StripeProcessorAdapter;
import classAdapter.target.PayPalPaymentProcessor;

/*
    Imagine um sistema de integração com serviços de pagamento online que atualmente suporta apenas um único provedor de pagamento, o PayPal.
    A integração com o PayPal é realizada através de uma interface PayPalPaymentProcessor, que possui métodos para iniciar um pagamento,
    processar um pagamento e verificar o status de um pagamento.

    Recentemente, a empresa decidiu expandir sua integração para incluir também o provedor de pagamento Stripe, que possui uma interface diferente
    da do PayPal. O Stripe possui métodos distintos para criar um pagamento, capturar um pagamento e verificar o status de um pagamento.

    Sua tarefa é aplicar o padrão Adapter para integrar o provedor de pagamento Stripe ao sistema existente de integração com serviços
    de pagamento online, garantindo que a nova funcionalidade seja adicionada sem a necessidade de alterações na interface existente do PayPal.

    Você deve criar um adaptador que permita que a classe StripeProcessor seja utilizada no sistema existente como se fosse uma implementação
    de PayPalPaymentProcessor. A adaptação deve ser feita de forma que a integração com o Stripe ocorra de maneira transparente e sem impactar o
    código já existente. Boa sorte!
 */
public class Client {
    public static void main(String[] args) {
        PayPalPaymentProcessor processor = new StripeProcessorAdapter();

        processor.initiatePayment(98.89);
        processor.processPayment("15");
        System.out.println(processor.checkPaymentStatus("15"));
    }
}