public class Employee {
    private int id;
    private String name;

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }
    @Override
    public String toString(){
        return "Employee[id:"+id+",name:"+name+"]";
    }
}

