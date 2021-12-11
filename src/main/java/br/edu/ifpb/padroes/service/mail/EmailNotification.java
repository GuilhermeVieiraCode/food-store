package br.edu.ifpb.padroes.service.mail;

import br.edu.ifpb.padroes.domain.Customer;

public class EmailNotification implements EventListener {

    private String emailAdministration = "contact@food-store.com";

    public void sendMailNotification(String message, Customer customer) {
        System.out.println("send mail notification to "+ customer.getEmail());
    }

    public void sendMailNotification(String message) {
        System.out.println("send mail notification to ="+emailAdministration);
    }

    @Override
    public void update(String message, Customer customer) {
        this.sendMailNotification(message, customer);
    }

    @Override
    public void update(String message) {
        this.sendMailNotification(message);
    }

}
