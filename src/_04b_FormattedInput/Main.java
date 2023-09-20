package _04b_FormattedInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Bitte gib Dein Alter ein:");
        age = scan.nextInt();
        System.out.printf("Alter: %d\n", age);

        scan.nextLine(); // "schluckt" ein \n aus dem Puffer ;)

        System.out.println("Bitte gib Deinen Namen ein:");
        String firstname;
        firstname = scan.nextLine();
        System.out.printf("Dein Name lautet: %s", firstname);
    }
}
