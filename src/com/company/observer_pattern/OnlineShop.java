package com.company.observer_pattern;

import java.util.ArrayList;
import java.util.List;

// the subject in our pattern will be an online shop
// which will notify the customers (the observers) regarding some promotions or sales

public class OnlineShop implements Subject {
    private List<Observer> customers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer customer) {
        customers.add(customer);
    }
    @Override
    public void removeSubscriber(Observer customer) {
        customers.remove(customer);
    }
    @Override
    public void notifySubscribers(Message m) {
        System.out.println("Mid Season Sales: 50% off starting this week!");
        for(Observer customer: customers) {
            customer.update(m);
        }
    }
}