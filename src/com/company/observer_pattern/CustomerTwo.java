package com.company.observer_pattern;

public class CustomerTwo implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Customer Two received : " + message.getMessageContent());
    }
}