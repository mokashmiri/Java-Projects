public class App {
    public static void main(String[] args) throws Exception {
        // Create an Employee
        Employee e = new Employee("John", 20080);

        // Create a Manager
        Manager m = new Manager("Andrea", "gardeners", 100000);

        // Call the print methods
        e.print();
        m.print();

        // Retrieve the manager's unit
        String unit = m.getUnit();
        System.out.println("Manager's unit is: " + unit);
    }
}
