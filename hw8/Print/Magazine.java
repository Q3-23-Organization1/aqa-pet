package hw8.Print;

public class Magazine implements Printable {

    private String name;
    private String release;

    public Magazine(String name, String release) {
        this.name = name;
        this.release = release;
    }

    @Override
    public void print() {
        System.out.println("Magazine : \""+ name +"\" - " + release);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine magazine) {
                System.out.println("Magazine : \"" + magazine.getName() + "\" - " + magazine.getRelease());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }
}
