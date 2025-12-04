public class BasePlus extends Commission{
    double baseSalary;

    public BasePlus(String n,int ssn, double grossSale, double commissionRate,double baseSalary){
        super(n,ssn,grossSale,commissionRate);
        this.baseSalary=baseSalary;
    }

    @Override
    double earning(){
        return super.earning()+this.baseSalary;
    }
}
