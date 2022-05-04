package com.company.observer_pattern;

public class Demo {
    public static void main(String[] args) {

        Subject shop = new OnlineShop();
        Observer customer1 = new CustomerTwo();
        Observer customer2 = new CustomerOne();
        Observer customer3 = new CustomerOne();

        // Adding two customers to the newsletter
        shop.addSubscriber(customer1);
        shop.addSubscriber(customer2);

        // Notifying customers (observers)
        shop.notifySubscribers(new Message("First notification"));

        //Remove a customer from the newsletter
        shop.removeSubscriber(customer1);

        //Adding another customer
        shop.addSubscriber(customer3);

        // Notifying the updated list of customers
        shop.notifySubscribers(new Message("Second notification"));
    }
}
