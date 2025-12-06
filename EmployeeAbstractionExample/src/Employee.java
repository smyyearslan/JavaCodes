public abstract class Employee implements ISalary {
    private String name;
    private double wage;

    public Employee(String name,double wage){
        this.name=name;
        this.wage=wage;
    }

    public String getName(){
        return name;
    }

    public double getwage(){
        return wage;
    }
}

