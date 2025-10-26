public class Main{

    public static void main(String[] args){
        Employee employer1= new Employee("Ahmet",850,38,2015);
        System.out.printf("EMPLOYER-1\nname: %s,\nsalary: %f,\nwork hours: %f,\nhire year %f\n\n",
                employer1.name,
                employer1.salary,
                employer1.work_hours,
                employer1.hire_year);

        System.out.println("Tax:"+employer1.tax());




        Employee employer2= new Employee("Selim",1500,27,2000);
        System.out.printf("EMPLOYER-2\nname: %s,\nsalary: %f,\nwork hours: %f,\nhire year %f\n",
                employer2.name,
                employer2.salary,
                employer2.work_hours,
                employer2.hire_year);
    }
}
