public class Hourly extends Employee {
    double wage;
    int hours;

    public Hourly(String n,int ssn, double wage,int hours){
        super(n,ssn);
        this.wage=wage;
        this.hours=hours;
    }

    double earning(){
        if (hours<=40){
            return wage*hours;
        }else{
            return 40*wage+(hours-40)*wage*1.5;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"wage:"+this.wage+"hours:"+this.hours;
    }
}
