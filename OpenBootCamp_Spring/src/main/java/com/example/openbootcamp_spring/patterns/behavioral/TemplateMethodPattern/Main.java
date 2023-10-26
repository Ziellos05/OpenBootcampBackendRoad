package com.example.openbootcamp_spring.patterns.behavioral.TemplateMethodPattern;

public class Main {

    public static void main(String[] args) {

        HTMLHome home = new HTMLHome();
        System.out.println(home.render());

        HTMLAboutUs about = new HTMLAboutUs();
        System.out.println(about.render());
    }
}