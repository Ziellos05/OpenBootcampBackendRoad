package com.example.openbootcamp_spring.patterns.behavioral.StatePattern;

public interface OrderState {

    void next(Order order);

    void previous(Order order);
}