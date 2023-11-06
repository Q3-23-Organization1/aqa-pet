package hw11.Print;


import java.util.Arrays;

import static hw11.Print.Magazine.printMagazines;
import static hw11.Print.Book.printBooks;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("The Raven", "Edgar Allan Poe");
        Book book2 = new Book("1984", "George Orwell ");

        Magazine magazine = new Magazine("Elle", "2023-1");
        Magazine magazine2 = new Magazine("Vogue", "2022-6");

        Printable[] printable = {book, book2, magazine, magazine2};

        Arrays.stream(printable).toList().forEach(Printable::print);

        System.out.println("-----");


        System.out.println("********");
        printMagazines(printable);

        System.out.println("********");
        printBooks(printable);


    }

}
