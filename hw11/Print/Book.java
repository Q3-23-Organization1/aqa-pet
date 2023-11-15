package hw11.Print;


import static java.util.Arrays.stream;


public class Book implements Printable {

    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public static void printBooks(Printable[] printable) {
        stream(printable)
                .filter(item -> item instanceof Book)
                .map(item -> (Book) item)
                .forEach(Book::print);
    }

    @Override
    public void print() {
        System.out.println("Book : \"" + name + "\" - " + author);
    }
}
