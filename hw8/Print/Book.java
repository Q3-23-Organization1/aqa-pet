package hw8.Print;

public class Book implements Printable {

    private String name;
    private String author;

    @Override
    public void print() {
        System.out.println("Book : \"" + name + "\" - " + author);
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book book) {
                System.out.println("Book : \"" + book.getName() + "\" - " + book.getAuthor());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
