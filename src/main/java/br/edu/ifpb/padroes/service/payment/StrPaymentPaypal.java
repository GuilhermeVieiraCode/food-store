package br.edu.ifpb.padroes.service.payment;

public class StrPaymentPaypal implements StrategyPayment{

    @Override
    public void definePayment() {

        System.out.println("Do paypal payment!");
    }
}
