package br.edu.ifpb.padroes.service.payment;

public class PaymentService {

    private StrategyPayment strategyPayment;

    public PaymentService(StrategyPayment strategyPayment){
        this.strategyPayment = strategyPayment;
    }

    public void doPayment(){
        strategyPayment.definePayment();
    }

    public void setPaymentType(StrategyPayment strategyPayment){
        this.strategyPayment = strategyPayment;
    }

    /*
    public enum PaymentType {
        CREDIT_CARD, DEBIT, BILLET, PAYPAL
    }


    public void doPayment(PaymentType type) throws Exception {
        switch (type) {
            case CREDIT_CARD:
                System.out.println("Do credit card payment!");
                break;
            case DEBIT:
                System.out.println("Do debit payment!");
                break;
            case BILLET:
                System.out.println("Do billet payment!");
                break;
            case PAYPAL:
                System.out.println("Do paypal payment!");
                break;
            default:
                throw new Exception("unknown payment method");
        }

    */

    }
