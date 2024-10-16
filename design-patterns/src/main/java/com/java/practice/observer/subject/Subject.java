package com.java.practice.observer.subject;

import com.java.practice.observer.observer.Observer;

public interface Subject {

    void registerObserver(Observer newObserver);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
