package challenge02;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        System.out.println("Hello there!!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter any whole number: ");
        int firstNumber =  scanner.nextInt();

        System.out.print("Please enter one more whole number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber+secondNumber;

        System.out.println("Sum of "+ firstNumber + " and " +secondNumber+" is "+sum);
    }
}
