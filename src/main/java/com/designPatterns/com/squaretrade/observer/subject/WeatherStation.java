package com.squaretrade.observer.subject;

import com.squaretrade.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observerList = new ArrayList<>();
    private String weather;

    @Override
    public void registerObserver(Observer newObserver) {
        observerList.add(newObserver);
    }

    @Override
    public void unregisterObserver(Observer observer) {
       observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.stream().forEach(observer -> observer.update(weather));

    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }

}
