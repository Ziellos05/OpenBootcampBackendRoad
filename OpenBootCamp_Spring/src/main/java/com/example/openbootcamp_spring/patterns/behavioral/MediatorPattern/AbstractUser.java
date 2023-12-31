package com.example.openbootcamp_spring.patterns.behavioral.MediatorPattern;

public abstract class AbstractUser {

    protected ChatMediator mediator;
    protected String name;

    protected AbstractUser(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.mediator.addUser(this);
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}