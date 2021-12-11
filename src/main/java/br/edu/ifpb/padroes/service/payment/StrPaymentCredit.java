package br.edu.ifpb.padroes.service.payment;

public class StrPaymentCredit implements StrategyPayment{

    @Override
    public void definePayment() {
        System.out.println("Do credit card payment!");
    }
}
