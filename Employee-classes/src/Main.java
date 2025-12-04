public class Main{

    public static void main(String[] args){
        Employee e1= new Hourly("Sude Cinar",1284276,20,30);
        Employee e2= new Salaried("Nisa Demir",3238974,41);
        Employee e3= new Commission("Mert Uzun",4138705,32,24);
        Employee e4= new BasePlus("Kemal Bulut",23015437,26,33,2000);

        Employee[] employees=new Employee[]{e1,e2,e3,e4};

        for(Employee e:employees)
            System.out.println(e+"salary"+e.earning());
    }
}