package lambda;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Comparator<String> comparator =
                (first, second) -> first.length() - second.length();

         System.out.println( comparator.compare("pierwszy", "drugi"));




    }
}
