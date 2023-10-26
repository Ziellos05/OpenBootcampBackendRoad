package com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern;

import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.processors.CSRFProcessor;
import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.processors.JWTAuthProcessor;
import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.processors.OAuthProcessor;
import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.providers.CSRFProvider;
import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.providers.JWTAuthProvider;
import com.example.openbootcamp_spring.patterns.behavioral.ResponsabilityChainPattern.providers.OAuthProvider;

public class Main {

    public static void main(String[] args) {

        AuthenticationProcessor jwt = new JWTAuthProcessor(null);
        AuthenticationProcessor oauth = new OAuthProcessor(jwt);
        AuthenticationProcessor csrf = new CSRFProcessor(oauth);

        csrf.isAuthorized(new CSRFProvider());
        csrf.isAuthorized(new JWTAuthProvider());
        csrf.isAuthorized(new OAuthProvider());

    }
}
