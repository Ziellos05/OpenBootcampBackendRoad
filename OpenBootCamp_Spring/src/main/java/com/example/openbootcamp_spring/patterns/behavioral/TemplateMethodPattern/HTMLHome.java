package com.example.openbootcamp_spring.patterns.behavioral.TemplateMethodPattern;

// tipo concreto
public class HTMLHome extends HTMLAboutUs {

    @Override
    public String body() {
        return """
                <h1> Hola desde Home </h1>
                """;
    }

}