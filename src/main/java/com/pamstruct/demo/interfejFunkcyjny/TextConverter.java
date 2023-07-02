package com.pamstruct.demo.interfejFunkcyjny;

public interface TextConverter {

    String convert (String text);


    default void displayText(){
        System.out.println("Hello form Functional interface");
    }

    static String covertToLoverCase(String text){
       return text.toLowerCase();

    }

}
