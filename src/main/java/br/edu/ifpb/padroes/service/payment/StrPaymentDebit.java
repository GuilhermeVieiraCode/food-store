package br.edu.ifpb.padroes.service.payment;

public class StrPaymentDebit implements StrategyPayment{

    @Override
    public void definePayment() {
        System.out.println("Do debit payment!");
    }
}
