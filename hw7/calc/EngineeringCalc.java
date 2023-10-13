package hw7.calc;

public class EngineeringCalc {

    public int addition(int num, int num2) {
        return num + num2;
    }

    public int subtraction(int num, int num2) {
        return num - num2;
    }

    public int multiplication(int num, int num2) {
        return num * num2;
    }

    public int division(int num, int num2) {
        if (num2 == 0) {
            System.out.println("Error. Can`t division by zero.");
            return 0;
        }
        return num / num2;
    }
}
