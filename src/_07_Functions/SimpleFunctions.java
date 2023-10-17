package _07_Functions;

import java.util.Scanner;

public class SimpleFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int number1 = sc.nextInt();
        System.out.print("n: ");
        int number2 = sc.nextInt();
        int result = add(number1,number2);
        System.out.println("s: " + result);
        // Aufruf von Divide:

    }

    // Implement a function add(number1, number2)
    // that receives two integer numbers, sums them
    // up and returns the result.

    public static int add(int number1, int number2){
        /*int result = 0;
        result = number1 + number2;
        return result;
        */
       return number1 + number2;
    }

    // Implement a function divide(number1, number2) that
    // receives two float numbers, divides the first
    // number by the second number and gives out the
    // result (use System.out.printf() and give out 2
    // decimal).
    //If a division by 0 would occur print a message
    // "division by zero is not allowed!" instead.
    public static void divide(float number1, float number2){
        float result = 0;
        if(number2 == 0){
            System.out.println("division by zero is not allowed!");
        } else {
            result = number1 / number2;
            System.out.printf("%.2f", result);
        }
    }
}
