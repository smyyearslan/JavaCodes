public class Main{
    public static void main(String[] args){

        Author author1=new Author("Antoine de Saint","anntoine@gmail.com");
        Book book1=new Book("The Little Prince",author1, 165);

        Author author2=new Author("Stefan Zweig","steefan@gmail.com");
        Book book2=new Book("Fear",author2, 70);

        Library library=new Library("Kutuphane");

        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();

    }
}
