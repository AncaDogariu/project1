package com.company.observer_pattern;

// Subject interface which provides methods to add and remove subscribers(observers) and notify them.

public interface Subject {
    public void addSubscriber(Observer observer);
    public void removeSubscriber(Observer observer);
    public void notifySubscribers(Message m);
}