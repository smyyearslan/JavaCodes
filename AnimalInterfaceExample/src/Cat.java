public class Cat extends Animal implements ISwimmable {
    public Cat(String name){
        super(name);
    }
    @Override
    public void swim(){
        System.out.println(name+"is swimming");
    }
}
