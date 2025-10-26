public class Company {
    private Employee employee ;
    private CompanyName companyname;

    public Company(Employee e, CompanyName c) {
        this.employee=e;
        this.companyname=c;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public CompanyName getCompanyName() {
        return this.companyname;
    }

    @Override
    public String toString(){
        return "Company[companyname:"+companyname+"-employee:"+employee+"]";
    }
}
