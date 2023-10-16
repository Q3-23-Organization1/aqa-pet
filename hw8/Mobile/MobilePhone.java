package hw8.Mobile;

public abstract class MobilePhone implements Mobile {

    String name;

    public MobilePhone(String name) {
        this.name = name;
    }

    public abstract void internet();

    public void powerOn() {
        System.out.println(name + " hello.");
    }

    public void powerOff() {
        System.out.println(name + " see you letter.");
    }

}
