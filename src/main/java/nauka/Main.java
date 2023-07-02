package nauka;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        someTest(1, ()-> System.out.println ("to jest liczba jeden"));
        someTest(2, ()-> System.out.println ("to jest liczba dwa"));


    }


    private static void someTest(int number, Runnable action){
        if(number % 2 ==0){
            action.run();
        }
        }


}
