public class Salaried extends Employee{
    double weeklysalary;

    public Salaried(String n,int ssn, double weeklysalary){
        super(n,ssn);
        this.weeklysalary=weeklysalary;
    }

    @Override
    double earning() {
        return weeklysalary;
    }
}
