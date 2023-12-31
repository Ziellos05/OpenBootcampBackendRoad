package com.example.openbootcamp_spring.patterns.behavioral.StrategyPattern;

public class PaypalStrategy implements PaymentStrategy{

    private String api;
    private String user;
    private String token;

    public PaypalStrategy(String api, String user, String token) {
        this.api = api;
        this.user = user;
        this.token = token;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with Paypal :)");
    }
}