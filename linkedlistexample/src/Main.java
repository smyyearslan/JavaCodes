import java.util.LinkedList;

public class Main{

    public static void main(String[] args){

        LinkedList<String> fruits = new LinkedList<String>();

        fruits.add("Çilek");
        fruits.add("Muz");
        fruits.add(1,"Kivi");
        fruits.add(2,"Mandalina");

        fruits.forEach(i->System.out.println(i));
    }
}