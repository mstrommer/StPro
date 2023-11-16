package _08_Midterm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = 0;
        System.out.print("Uhrzeit: ");
        time = sc.nextInt();
        while(time >= 0 && time <= 23){
            if(time == 12 || time == 13){
                System.out.println("Mittag");
            } else if(time >= 7 && time <= 11){
                System.out.println("Vormittag");
            } else if(time >= 14 && time <= 18){
                System.out.println("Nachmittag");
            } else if(time >= 19 && time <= 21){
                System.out.println("Abend");
            } else {
                System.out.println("Nacht");
            }
            System.out.println("[nnnnnnnVVVVVMMNNNNNAAAnn]");
            System.out.print("[");
            for(int i = 0; i < 24;i++){
                if(time == i){
                    System.out.print("*");
                    continue;
                }
                System.out.print(".");
            }
            System.out.println("]");
            System.out.print("Uhrzeit: ");
            time = sc.nextInt();
        }
        System.out.println("beendet.");
    }
}