package com.example.openbootcamp_spring.patterns.behavioral.MediatorPattern;

public class User extends AbstractUser{

    protected User(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        this.mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("received!");

    }

}
