package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.log.LogHandler;
import br.edu.ifpb.padroes.service.log.LogService;
import br.edu.ifpb.padroes.service.mail.EventManager;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.service.mail.EmailNotification;

public class OrderManager {

    public OrderManager(Order order) {
        this.order = order;
        this.events = new EventManager("email");
    }
    public EventManager events;

    private Order order;

    private LogService logService = new LogService(new LogHandler(LogHandler.LogHandlerType.FILE));

    public void payOrder(PaymentService paymentService) {
        order.setStatus(Order.OrderStatus.IN_PROGRESS);
        try {
            paymentService.doPayment();
            order.setStatus(Order.OrderStatus.PAYMENT_SUCCESS);
            events.notify("email",String.format("Order %d completed successfully", order.getId()));
            logService.info("payment finished");
        } catch (Exception e) {
            logService.error("payment refused");
            order.setStatus(Order.OrderStatus.PAYMENT_REFUSED);
            events.notify("email",String.format("Order %d completed successfully", order.getId()));
        }
    }

    public void cancelOrder() {
        order.setStatus(Order.OrderStatus.CANCELED);
        logService.debug(String.format("order %d canceled", order.getId()));
        events.notify("email",String.format("Order %d completed successfully", order.getId()));
    }

}
