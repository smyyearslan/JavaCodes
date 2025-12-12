import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        LinkedList<String> surnames = new LinkedList<String>();

        names.add("Mustafa");
        surnames.add("Demir");

        names.add("Furkan");
        surnames.add("Yıldırım");

        names.add("Şeyda");
        surnames.add("Yılmaz");

        for (int i = 0; i < 3; i++) {
            System.out.println(names.get(i));
            System.out.println(surnames.get(i));
        }
    }
}