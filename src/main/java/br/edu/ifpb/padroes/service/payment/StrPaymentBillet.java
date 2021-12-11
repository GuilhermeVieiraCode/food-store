package br.edu.ifpb.padroes.service.payment;

public class StrPaymentBillet implements StrategyPayment{

    @Override
    public void definePayment() {

        System.out.println("Do billet payment!");
    }
}
