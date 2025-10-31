public class Library {
    private String name;
    private Book[] books;
    private int count;

    public Library(String name){
        this.name=name;
        this.books= new Book[100];
        this.count=0;
    }

    public void addBook(Book book){
       this.books[count]=book;
       this.count++;
    }

    public void displayBooks() {
        int i;
        for(i=0;i<count;i++){
            System.out.println("\n" + books[i]);
        }
    }
}
