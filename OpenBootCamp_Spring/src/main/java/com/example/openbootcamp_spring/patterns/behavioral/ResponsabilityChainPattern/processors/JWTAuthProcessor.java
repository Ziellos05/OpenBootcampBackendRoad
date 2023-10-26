package com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.processors;

import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.AuthenticationProcessor;
import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.AuthenticationProvider;
import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.providers.JWTAuthProvider;

public class JWTAuthProcessor extends AuthenticationProcessor {
    public JWTAuthProcessor(AuthenticationProcessor next) {
        super(next);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider provider) {

        if(provider instanceof JWTAuthProvider)
            return true;

        return next.isAuthorized(provider);
    }
}