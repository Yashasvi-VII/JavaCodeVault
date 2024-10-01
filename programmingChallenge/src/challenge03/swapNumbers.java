package challenge03;

import java.util.Scanner;

public class swapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter any whole number ");
        int firstNumber = sc.nextInt();

        System.out.print("Please enter one more whole number ");
        int secondNumber = sc.nextInt();

        System.out.println("Numbers before swapping FirstNumber: "+firstNumber +" and SecondNumber: "+secondNumber);

        int temp = 0;
        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("Numbers before swapping FirstNumber: "+firstNumber +" and SecondNumber: "+secondNumber);
    }
}
