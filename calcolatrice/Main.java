import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Enter a number");

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);


        System.out.println(calculator.sum(sc1.nextInt(), sc1.nextInt()));
        /*
        System.out.println(calculator.substract(firstNumber, secondNumber));
        System.out.println(calculator.multiply(firstNumber, secondNumber));
        System.out.println(calculator.divide(firstNumber, secondNumber));
        */

    }
}
