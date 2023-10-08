package hw6;

public class User {

    String userName = "Incognito";
    //if user doesn't enter age, we will assume that user is 18 years old
    private int age = 18;
    String email;
    private String password;
    boolean isActive;
    double amountSpentMoney = 0.0;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    void makePurchase(double purchasePrice) {
        System.out.println(userName + " spent " + purchasePrice);
        amountSpentMoney += purchasePrice;
    }

    void printTotalAmountOfSpentMoney() {
        System.out.println(userName + " has total amount of spent money " + amountSpentMoney);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("You shall not pass");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.matches("^(?=(.*[a-zA-Z]){6})(?=(.*[0-9]){2}).{8,}$")) {
            this.password = password;
        } else {
            System.out.println("Password isn`t valid. " +
                    "Enter at least 6 letters and 2 digits");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                ", amountSpentMoney=" + amountSpentMoney +
                '}';
    }
}
