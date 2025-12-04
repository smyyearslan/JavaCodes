public class Commission extends Employee{
    double grossSales;
    double commissionRate;

    public Commission(String n, int ssn,double grossSales,double commissionRate){
        super(n,ssn);
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }

    @Override
    double earning(){
        return commissionRate*grossSales;
    }

    @Override
    public String toString(){
        return super.toString()+"grossSales"+this.grossSales+"commissionRate"+this.commissionRate;
    }
}
