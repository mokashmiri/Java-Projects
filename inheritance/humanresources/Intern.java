package humanresources;

public class Intern extends Employee{

    boolean isLucky=false;

    public Intern(String name, int wage){
        this.name = name;
        this.wage=wage;
    }

    @Override
    public void print(){
        // NOT LSP COMPLIANT
        //if(wage>1000000){
        //    isLucky=true;
        //}
        //if(isLucky){
        //    System.out.println(name);
        //}

        System.out.println(name); // ok, the override is a variation of base class behavior
        
        
    }

}
