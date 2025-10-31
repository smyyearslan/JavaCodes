public class Book{
    private String title;
    private Author author;
    private double price;

    public Book(String title,Author author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public String getTitle(){
        return this.title;
    }

    public Author getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }

    public String toString(){
        return "[Book title:"+title+"\nBook author"+author+"\nBook price:"+price+"]";
    }

}