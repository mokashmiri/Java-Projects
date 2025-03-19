package inheritance;

public class Manager extends Employee {
    private String unit;

    // Constructor
    public Manager(String name, String unit, double wage) {
        // Call the superclass (Employee) constructor
        super(name, wage);
        this.unit = unit;
    }

    // Getter for unit
    public String getUnit() {
        return unit;
    }

    // Override the print method to include the unit
    @Override
    public void print() {
        // First call the Employee's print
        super.print();
        // Then print the Manager's additional info
        System.out.println("Unit: " + unit);
    }
}
