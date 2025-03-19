package inheritance;

public class Employee {
    private String name;
    private double wage;

    // Constructor
    public Employee(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    // Print method
    public void print() {
        System.out.println("Name: " + name + ", Wage: " + wage);
    }
}
