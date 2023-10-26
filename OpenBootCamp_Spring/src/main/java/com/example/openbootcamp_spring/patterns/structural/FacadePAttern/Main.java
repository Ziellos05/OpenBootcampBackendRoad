package com.example.openbootcamp_spring.patterns.structural.FacadePAttern;

import com.example.openbootcamp_spring.patterns.structural.FacadePAttern.PiecesLibrary.SmartPhone;

public class Main {

    public static void main(String[] args) {

        // crear un smartphone
        SmartPhone oneplus = SmartPhoneFacade.startSmartPhone();
    }

}