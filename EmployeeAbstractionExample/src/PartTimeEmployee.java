public class PartTimeEmployee extends Employee implements IBonus{

    public PartTimeEmployee(String name, double wage){
        super(name,wage);
    }
    @Override
    public double CalculateSalary(){
        return this.getwage() * 1.10;
    }

    @Override
    public double getBonus(){
        return  this.getwage() * 0.5;
    }
}
