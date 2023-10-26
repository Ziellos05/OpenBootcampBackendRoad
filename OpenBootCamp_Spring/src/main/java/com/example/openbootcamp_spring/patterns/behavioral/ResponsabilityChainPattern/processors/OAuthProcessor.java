package com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.processors;

import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.AuthenticationProcessor;
import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.AuthenticationProvider;
import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.providers.CSRFProvider;
import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.providers.OAuthProvider;

public class OAuthProcessor extends AuthenticationProcessor {


    public OAuthProcessor(AuthenticationProcessor next) {
        super(next);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider provider) {

        // comprobaciones particulares de este processor
        if(provider instanceof OAuthProvider){
            return true;
        }

        // llama al siguiente processor
        return next.isAuthorized(provider);
    }
}
