package _06_Loops;

import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int position = 0;
        do {
            System.out.print("Eingabe: ");
            input = sc.nextInt();
            if(input == 4){
                System.out.print("Links");
            } else if(input == 6){
                System.out.println("Rechts");
            } else if(input == 5){
                System.out.println("Ende");
            } else {
                System.out.println("ungueltig");
            }
        } while(input != 5);
    }
}
