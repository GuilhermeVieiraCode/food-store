package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.order.OrderManager;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.service.payment.StrPaymentCredit;

public class Client {
    public static void main(String[] args) {

        Order order = new Order();
        OrderManager orderManager = new OrderManager(order);
        StrPaymentCredit creditPayment = new StrPaymentCredit();
        PaymentService paymentService = new PaymentService(creditPayment);
        orderManager.payOrder(paymentService);
        orderManager.cancelOrder();
    }
}
