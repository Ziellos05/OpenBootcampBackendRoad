package com.example.openbootcamp_spring.patterns.behavioral.MediatorPattern;

public interface ChatMediator {

    public void sendMessage(String message, AbstractUser user);

    public void addUser(AbstractUser user);

    public void removeUser(AbstractUser user);
}