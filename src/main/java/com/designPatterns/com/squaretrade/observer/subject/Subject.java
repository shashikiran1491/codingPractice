package com.squaretrade.observer.subject;

import com.squaretrade.observer.observer.Observer;

public interface Subject {

    void registerObserver(Observer newObserver);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
