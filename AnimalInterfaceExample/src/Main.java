public class Main {
    public static void main(String[] args){
        Duck duck=new Duck("Vakvak");
        duck.printName();
        duck.move();
        duck.swim();
        duck.fly();

        Cat cat=new Cat("Pamuk");
        cat.printName();
        cat.swim();

        Eagle eagle=new Eagle("sahin");
        eagle.printName();
        eagle.fly();
    }
}