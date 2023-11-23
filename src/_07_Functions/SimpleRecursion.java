package _07_Functions;

public class SimpleRecursion {

    public static void main(String[] args) {
        //countdownIter(10);
        countdownRec(10);
    }

    public static void countdownIter(int n){
        while((n--)>=0){
            System.out.println(n);
        }
        /*
        for (; n >= 0; n--) {
            System.out.println(n);
        }*/
        System.out.println("Boom!");
    }
    public static void countdownRec(int n){
        // Base Case
        if (n == 0) {
            System.out.println("0");
            System.out.println("Boom!");
            return;
        }
        // General Case
        System.out.println(n);
        countdownRec(n-1);
    }
}
