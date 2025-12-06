public class Main{
    public static void main (String[] args){
        FullTimeEmployee e1= new FullTimeEmployee("Gülay",20.000);
        FullTimeEmployee e2= new FullTimeEmployee("Mustafa",35.000);

        PartTimeEmployee e3= new PartTimeEmployee("Sümeyye",10.000);
        PartTimeEmployee e4= new PartTimeEmployee("Furkan",15.000);

        System.out.println("Ad: " + e1.getName());
        System.out.println("Hesaplanan Maaş: " + e1.CalculateSalary());
        System.out.println("Ad: " + e2.getName());
        System.out.println("Hesaplanan Maaş: " + e2.CalculateSalary());
        System.out.println("Ad: " + e3.getName());
        System.out.println("Hesaplanan Maaş: " + e3.CalculateSalary());
        System.out.println("Ad: " + e4.getName());
        System.out.println("Hesaplanan Maaş: " + e4.CalculateSalary());
    }
}