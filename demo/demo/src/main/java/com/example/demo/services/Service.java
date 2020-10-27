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
                digitCounter += 1;
            }
            else if(Character.isLowerCase(characters.charAt(i))){
                lowercaseLetterCounter += 1;
            }
            else if(Character.isUpperCase(characters.charAt(i))){
                uppercaseLetterCounter += 1;
            }
            else
                specialSignsCounter += 1;

        }
        StringBuilder string = new StringBuilder("Numbers: "+ digitCounter + ", UpperCase Letters: " + uppercaseLetterCounter +
                                                 ", LowerCase Letters: "+ lowercaseLetterCounter + ", Another Signs: "+ specialSignsCounter);
        return string.toString();
    }
}
