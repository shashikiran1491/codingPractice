package com.java.practice.observer;

import com.java.practice.observer.observer.PhoneObserver;
import com.java.practice.observer.observer.TvObserver;
import com.java.practice.observer.subject.WeatherStation;

public class Client {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        PhoneObserver po = new PhoneObserver();
        TvObserver tv = new TvObserver();

        weatherStation.registerObserver(po);
        weatherStation.registerObserver(tv);

        weatherStation.setWeather("sunny weather");
        weatherStation.setWeather("rainy weather");

        weatherStation.unregisterObserver(po);

        weatherStation.setWeather("sunny weather");

    }

}
