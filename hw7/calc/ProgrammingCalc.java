package hw7.calc;

public class ProgrammingCalc extends EngineeringCalc {

    public static double calcSin(double a) {
        return Math.sin(a);
    }

    public static double calcCos(double a) {
        return Math.sin(a);
    }

    public static double calcSqrt(double a) {
        return Math.sqrt(a);
    }

    public double calcExponentiation(double num, double num2) {
        return Math.pow(num, num2);
    }

    public int calcFactorial(int n) {
        int sum = 1;
        for (int i = 1; i < n; ) {
            sum *= ++i;
        }
        return sum;
    }
}
