package challenge02;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        System.out.println("Hello there!!");
        System.out.print("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);

        String name =  scanner.nextLine();

        System.out.println("Good afternoon "+ name);
    }
}
