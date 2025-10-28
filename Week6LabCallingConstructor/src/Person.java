public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    private static int idCounter=0;
    public Person(int id,String firstName,String lastName,int age){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public Person(String firstName,String lastName){
        this(++idCounter,firstName,lastName,0);
    }

    public Person(int id){
        this(id,null,null,0);
    }

    public Person(){
        //id+=id;
        this(++idCounter,null,null,0);
    }

    @Override
    public String toString(){
        return "Person[id="+id+" firstName="+firstName+" lastName="+lastName+" age="+age+"]";
    }
}











