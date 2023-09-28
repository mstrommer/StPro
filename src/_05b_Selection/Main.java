package _05b_Selection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // switch Statement
        System.out.print("Enter Day: ");
        int day = sc.nextInt();
        switch (day){
            case 0 :
                System.out.println("Monday");
                break;
            case 1 :
                System.out.println("Tuesday");
                break;
            case 2 :
                System.out.println("Wednesday");
                break;
            case 3 :
                System.out.println("Thursday");
                break;
            case 4 :
                System.out.println("Friday");
                break;
            case 5 :
                System.out.println("Saturday");
                break;
            case 6 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid number entered.");
        }
    }
}
