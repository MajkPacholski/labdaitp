package nauka;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jan",20,3000.50));
        employees.add(new Employee("Andrzej",30,5000));
        employees.add(new Employee("Adam",24,7000.20));
        employees.add(new Employee("Adam",22,2000));
        employees.add(new Employee("Grześ",27,2000));
        employees.add(null);


        Comparator <Employee> comparator = Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getAge)
                .thenComparingDouble(Employee::getSalary)
                .reversed();

        employees.sort(Comparator.nullsLast(comparator));
        employees.forEach(System.out::println);

    }
}
