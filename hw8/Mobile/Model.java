package hw8.Mobile;

public class Model extends MobilePhone {

    String model;

    public Model(String name, String model) {
        super(name);
        this.model = model;
    }

    @Override
    public void call(String number) {
        System.out.println("Calling... to number " + number);
    }

    @Override
    public void sms(String number, String message) {
        System.out.println("Sent message \"" + message + "\" to " + number);
    }

    @Override
    public void internet() {
        if (name.equals("Nokia") && model.equals("1100")) {
            System.out.println(name + " " + model + " no internet access");
        } else System.out.println("Internet connecting...");
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                "} ";
    }
}
