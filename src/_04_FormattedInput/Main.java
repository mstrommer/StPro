package _04_FormattedInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input -> Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie die " +
                "aktuelle Temperatur ein (Celsius): ");
        // int celsius = 27; statisch! hard coded
        int celsius = scan.nextInt();
        double fahrenheit;
        fahrenheit = celsius * 1.8 + 32; // FW = CW * 1,8 + 32
        System.out.printf("Temperatur in Fahrenheit: %.1f", fahrenheit);
        System.out.printf("Temperatur in Fahrenheit: %.1f", celsius * 1.8 + 32);
        scan.close(); // schließt den Scanner
    }
}
