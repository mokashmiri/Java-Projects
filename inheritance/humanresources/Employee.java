package humanresources;

public class Employee {

    protected String name;
    protected int wage;

    public Employee(){};
    
    public Employee(String name, int wage){
        this.name = name;
        this.wage=wage;
    }

    public String getName(){
        return name;
    }

    public int getWage(){
        return wage;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setWage(int wage){
        this.wage=wage;
    }

    public void print(){
        System.out.println("The employee's name is " + name);
    }

}
