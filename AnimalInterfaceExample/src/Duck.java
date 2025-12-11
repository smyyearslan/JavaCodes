public class Duck extends Animal implements IMoveable , IFlyable , ISwimmable {

    public Duck(String name){
        super(name);
    }

    @Override
    public void swim(){
        System.out.println(name+" is swimming");
    }
    @Override
    public void fly(){
        System.out.println(name+" is flying");
    }
    @Override
    public void move(){
        System.out.println(name+" is waddling");
    }

}
