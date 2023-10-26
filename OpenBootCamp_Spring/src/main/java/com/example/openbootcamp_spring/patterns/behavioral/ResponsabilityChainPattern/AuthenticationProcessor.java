package com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern;

public abstract class AuthenticationProcessor {

    public AuthenticationProcessor next;

    public AuthenticationProcessor(AuthenticationProcessor next) {
        this.next = next;
    }

    public abstract boolean isAuthorized(AuthenticationProvider provider);
}
