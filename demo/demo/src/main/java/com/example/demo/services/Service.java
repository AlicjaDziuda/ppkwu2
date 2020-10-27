package com.example.demo.services;
@org.springframework.stereotype.Service

public class Service {
    public String recognizeCharacters(String characters) {
        int digitCounter = 0;
        int uppercaseLetterCounter = 0;
        int lowercaseLetterCounter = 0;
        int specialSignsCounter = 0;
        for( int i =0 ; i < characters.length(); i++){

            if(Character.isDigit(characters.charAt(i))){
                digitCounter = digitCounter +1;
            }

        }

        return String.valueOf(digitCounter);
    }
}
