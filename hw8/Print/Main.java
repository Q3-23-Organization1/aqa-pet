package hw8.Print;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("The Raven", "Edgar Allan Poe");
        Book book2 = new Book("1984", "George Orwell ");

        Magazine magazine = new Magazine("Elle", "2023-1");
        Magazine magazine2 = new Magazine("Vogue", "2022-6");

        Printable[] printable = {book, book2, magazine, magazine2};

        for (Printable item : printable) {
            item.print();

            System.out.println("-----");
        }

        System.out.println("********");
        Magazine.printMagazines(printable);

        System.out.println("********");
        Book.printBooks(printable);


    }

}
