package com.example.openbootcamp_spring.patterns.behavioral.ObserverPattern;

public class Main {

    public static void main(String[] args) {
        Weather aemet = new Weather();

        WeatherObserver computer = new Computer();
        aemet.addObserver(computer);
        aemet.addObserver(new SmartPhone());

        aemet.changeWeather(WeatherType.CLOUDY);
        aemet.changeWeather(WeatherType.RAINY);
        aemet.changeWeather(WeatherType.SUNNY);

        aemet.removeObserver(computer);
        aemet.changeWeather(WeatherType.SUNNY);
    }
}