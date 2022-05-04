package com.company.observer_pattern;


public class CustomerOne implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Customer One received: " + message.getMessageContent());
    }

}