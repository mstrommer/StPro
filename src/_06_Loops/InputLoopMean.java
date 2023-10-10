package _06_Loops;

import java.util.Scanner;

public class InputLoopMean {
    public static void main(String[] args) {
        // Use a while loop to read positive integer numbers on the console.
        // When zero or a negative number is entered, your program terminates.
        // After input the program prints the mean of all valid inputs with one
        // digit after the comma, then the program prints End. .
        // Note: the mean is only printed if at least one valid number was entered!
        Scanner sc = new Scanner(System.in);
        int number = 0, sum = 0, count = 0;
        do {
            System.out.print(count + " : ");
            number = sc.nextInt();
            if(number > 0) {
                sum += number;
            }else { // Alternative
                break;
            }
            count++;
        } while(true);
        double mean = (double) sum / count;
        //System.out.println("Mean: " + mean);
        System.out.printf("Mean: %.1f\n", mean);
        System.out.println("End.");
    }
}
