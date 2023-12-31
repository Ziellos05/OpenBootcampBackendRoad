package com.example.openbootcamp_spring.patterns.behavioral.StatePattern;

public class ProcessingState implements OrderState {

    @Override
    public void next(Order order) {

        System.out.println(
                String.format("Updating Order %d from %s to %s.",
                        order.getId(),
                        this.getClass().getSimpleName(),
                        ShippedState.class.getSimpleName()
                ));

        order.setState(new ShippedState());


    }

    @Override
    public void previous(Order order) {

        System.out.println("Root state");
    }

}