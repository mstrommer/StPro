package _06_Loops;

import java.util.Scanner;

public class InputLoopDoWhile {
    public static void main(String[] args) {
        // Use a while loop to read positive integer
        // numbers on the console. When zero or a negative
        // number is entered, your program terminates.
        // Then, the program prints End. .
        Scanner sc = new Scanner(System.in);
        System.out.println("Do While Test");
        int number = 0;
        do {
            System.out.print(": ");
            number = sc.nextInt();
        } while(number > 0);
        System.out.println("End.");
    }
}
