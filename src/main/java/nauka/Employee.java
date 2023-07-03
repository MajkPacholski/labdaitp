package nauka;


public class Employee {

    private String Name;
    private int age;
    private double salary;


    Employee() {
    }

    Employee(final String name, final int age, final double salary) {
        Name = name;
        this.age = age;
        this.salary = salary;
    }

    String getName() {
        return Name;
    }

    void setName(final String name) {
        Name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(final int age) {
        this.age = age;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(final double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
