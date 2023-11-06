package hw11.Print;

import java.util.Arrays;

public class Magazine implements Printable {

    private String name;
    private String release;

    public Magazine(String name, String release) {
        this.name = name;
        this.release = release;
    }

    @Override
    public void print() {
        System.out.println("Magazine : \"" + name + "\" - " + release);
    }

    public static void printMagazines(Printable[] printable) {
        Arrays.stream(printable)
                .filter(item -> item instanceof Magazine)
                .map(item -> (Magazine) item)
                .forEach(Magazine::print);
    }
}
