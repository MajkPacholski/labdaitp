package com.pamstruct.demo.interfejFunkcyjny;

public class ConverterService {

    public static void main(String[] args){

    TextConverter textConverter = text -> text.replace(" ",".");

        String result = textConverter.convert(" Przykøádowy tekst ");
        System.out.println(result);

        textConverter.displayText();

        String res2 = TextConverter.covertToLoverCase("TEXT TO LOWERCASE");
        System.out.println(res2);
    }
}
