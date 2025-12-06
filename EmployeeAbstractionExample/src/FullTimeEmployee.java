public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, double wage){
        super(name,wage);
    }

   @Override
    public double CalculateSalary(){
        return this.getwage() * 1.10;
    }
}
