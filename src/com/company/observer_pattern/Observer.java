package com.company.observer_pattern;

// The Observers (customers) will know when there's an update from their subject

public interface Observer {
    public void update(Message message);
}