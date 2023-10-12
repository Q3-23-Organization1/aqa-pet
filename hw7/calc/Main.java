package hw7.calc;

public class Main {

    public static void main(String[] args) {
        ProgrammingCalc calc = new ProgrammingCalc();

        System.out.println("Factorial = " + calc.calcFactorial(4));
        System.out.println("Exponentiation = " + calc.calcExponentiation(4, 2));
        System.out.println("Square root = " + calc.calcSqrt(4));
        System.out.println("Cosinus = " + calc.calcCos(4));
        System.out.println("Sinus =" + calc.calcSin(4));

        System.out.println("Addition = " + calc.addition(10, 1));
        System.out.println("Subtraction = " + calc.subtraction(10, 1));
        System.out.println("Division = " + calc.division(10, 2));
        System.out.println("Multiplication = " + calc.multiplication(10, 2));


    }
}