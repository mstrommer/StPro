package _06_Loops;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        // Ausgabe einer Matrix
        // + * +
        // * + *
        // + * +
        System.out.println("Expected:");
        System.out.println("+ * +");
        System.out.println("* + *");
        System.out.println("+ * +");
        // 3x3
        // Nested Loops / Geschachtelte Schleifen
        System.out.println("Actual:");
        for (int i = 0; i < 3; i++) { // äußere Schleife
            for (int j = 0; j < 3; j++) { // innere Schleife
                if((j+i) % 2 != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("r: ");
        int rows = sc.nextInt();
        System.out.print("c: ");
        int cols = sc.nextInt();

        for (int i = 0; i < rows; i++) { // äußere Schleife
            for (int j = 0; j < cols; j++) { // innere Schleife
                if((j+i) % 2 != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }
}
