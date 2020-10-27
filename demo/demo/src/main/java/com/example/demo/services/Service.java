package com.example.demo.services;
@org.springframework.stereotype.Service

public class Service {
    public String recognizeCharacters(String characters) {
        int digitCounter = 0;
        for( int i =0 ; i < characters.length(); i++){
            Boolean flag = Character.isDigit(characters.charAt(i));
            switch (flag.toString()) {
                case "true":
                    digitCounter = digitCounter +1;
                    break;
                case "false":
                    break;
                default:
            }
        }

        return String.valueOf(digitCounter);
    }
}
