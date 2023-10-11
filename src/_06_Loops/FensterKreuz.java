package _06_Loops;

import  java.util.Scanner;

public class FensterKreuz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = 0, height = 0, horizontal = 0, vertical = 0;
        // Validiertes Einlesen von Werten
        do {
            System.out.print("Breite: ");
            width = sc.nextInt();
        }while(width < 1);
        do {
            System.out.print("Hoehe: ");
            height = sc.nextInt();
        }while(height < 1);
        do {
            System.out.print("horizontal: ");
            horizontal = sc.nextInt();
        }while(horizontal < 1 || width < horizontal);
        do {
            System.out.print("vertikal: ");
            vertical = sc.nextInt();
        }while(vertical < 1 || height < vertical);
        // Ausgabe des Fensterkreuzes
        int dotCounter = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if(j != horizontal && i != vertical) {
                    System.out.print(".");
                    dotCounter++;
                } else if(i == vertical && j != horizontal){
                    System.out.print("-");
                } else if(i != vertical){
                    System.out.print("|");
                }else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
        System.out.println(dotCounter + " dot(s).");

    }
}
