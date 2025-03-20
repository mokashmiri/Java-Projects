package inheritance.humanresources;
public class App {
    public static void main(String[] args) throws Exception {

        Employee e = new Employee("John", 20000);

        Manager m = new Manager("Andrea", "gardeners", 100000);

        e.print();
        m.print();

        String unit = m.getUnit();

        Employee[] team = {
            new Intern("Kim", 10000000),
            new Employee("Bill", 2000),
            new Employee("Linda", 2100),
            new Manager("Gill", "mechanics", 3000)
        };

        for (Employee employee : team){
            employee.print();
            if (employee instanceof Manager){ 
                Manager m1 = (Manager) employee;
                m1.printUnit();
            } 
        }

        Manager m2 = new Manager("Lia", "cooks", 1110);
        Employee e2;
        e2 = m2;

        
        
        
        


    }
}
