package humanresources;

public class Manager extends Employee {

    String managedUnit;

    public Manager(String name, String unit, int wage){
        //setName(name);
        //setWage(wage);
        this.name=name;
        this.managedUnit=unit;
        this.wage=wage;
    }

    public String getUnit(){
        return managedUnit;
    }

    public void printUnit(){
        System.out.println(managedUnit);
    }

    public void print(){
        System.out.println("The manager's name is "+name+" and they manage the "+managedUnit+" unit.");
    }


}
