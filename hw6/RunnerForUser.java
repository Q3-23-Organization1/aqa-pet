package hw6;

public class RunnerForUser {

    public static void main(String[] args) {

        User user = new User();

        user.makePurchase(200);
        user.makePurchase(700);
        user.makePurchase(300.2);
        user.isActive = true;

        User user2 = new User("Slava");

        System.out.println(user2.userName + "`s age is " + user2.getAge());
        user2.makePurchase(100.50);
        user2.makePurchase(500.90);

        user2.setPassword("qwer12");
        user2.setPassword("qwerty12");
        System.out.println(user2.userName + "`s password is " + user2.getPassword());
        user2.email = "blablabla@gmail.com";

        User user3 = new User("Human Human", "qwerty");
        user3.makePurchase(50.50);
        user3.makePurchase(100.50);
        user3.setAge(20);

        System.out.println("------");

        user.printTotalAmountOfSpentMoney();
        System.out.println(user);

        System.out.println("------");

        user2.printTotalAmountOfSpentMoney();
        System.out.println(user2);

        System.out.println("------");

        user3.printTotalAmountOfSpentMoney();
        System.out.println(user3);

    }
}
