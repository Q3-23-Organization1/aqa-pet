package hw8.Mobile;


public class Main {


    public static void main(String[] args) {

        MobilePhone nokia = new Model("Nokia", "1100");
        MobilePhone nokia2 = new Model("Nokia", "3310");
        MobilePhone samsung = new Model("Samsung", "Note20");
        MobilePhone iPhone = new Model("iPhone", "14 PRO");

        MobilePhone[] mobilePhones = {nokia, nokia2, samsung, iPhone};


        for (MobilePhone mobilePhone : mobilePhones) {
            System.out.println(mobilePhone);
            mobilePhone.sms("+380222222222", "Hello.");
            mobilePhone.internet();
            mobilePhone.call("+380222222222");
            mobilePhone.powerOn();
            mobilePhone.powerOff();

            System.out.println("-------");
        }
    }


}
