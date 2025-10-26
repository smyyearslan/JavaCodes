public class Main{
    public static void main(String[] args){

        Employee emp1=new Employee(23,"Suna");
        Employee emp2=new Employee(54,"Beyza");
        Employee emp3=new Employee(42,"Fırat");

        Company com1=new Company(emp1,CompanyName.GOOGLE);
        Company com2=new Company(emp2,CompanyName.AKINSOFT);
        Company com3=new Company(emp3,CompanyName.APPLE);

        System.out.println(com1);
        System.out.println(com2);
        System.out.println(com3);

    }
}
