public class Employee {
     String name;
     double salary;
     double work_hours;
     double hire_year;

    Employee(String name, double salary, double work_hours, double hire_year ){
        this.name=name;
        this.salary=salary;
        this.work_hours=work_hours;
        this.hire_year=hire_year;
    }

    public double tax() {
        if (this.salary > 1000) {
            return salary * 0.03;
        } else {
            return 0.0;
        }
    }
    public double bonus()
    {
        return 30*this.work_hours;
    }

    public double increase()
    {
        double year = 2025-this.hire_year;
        if(year<10){
            return salary*0.05;
        }else if(9<year&&year<20){
            return salary*0.10;
        }else{
            return salary*0.15;
        }
    }
}

























