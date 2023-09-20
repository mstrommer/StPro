package _05_Selection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("g: ");
        int grade = scan.nextInt();
        // assuming only valid grades are passed from the user
        if (grade < 5) { // grade <= 4
            System.out.printf("passed.\n");
        } else {
            System.out.printf("failed.\n");
        }
    }
}
