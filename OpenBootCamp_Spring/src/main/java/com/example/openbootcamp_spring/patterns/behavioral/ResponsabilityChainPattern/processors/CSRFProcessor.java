package com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.processors;

import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.AuthenticationProcessor;
import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.AuthenticationProvider;
import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.providers.CSRFProvider;

public class CSRFProcessor extends AuthenticationProcessor {
    public CSRFProcessor(AuthenticationProcessor next) {
        super(next);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider provider) {
        // ... codigo
        if(provider instanceof CSRFProvider)
            return true;
        //
        return next.isAuthorized(provider);
    }
}