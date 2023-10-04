package _06_Loops;

public class Main {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");

        System.out.println("*****");

        // while Loop
        int count = 0; // Zählvariable
        while(count < 100){
            // Statements
            System.out.print("*");
            if((count+1) % 10 == 0){
                System.out.println();
            }
            count++;
            // count = count + 1;
            // count += 1;
        }

        // for Loop
        for(int i = 0;i<100;i++){
            System.out.print("*");
        }

        // Endlosschleifen
        for(;;){
            System.out.println("*");
        }
        /*
        while(true){
            System.out.println("*");
        }*/
    }
}
