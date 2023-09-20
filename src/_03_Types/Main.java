package _03_Types;

public class Main {
    public static void main(String []args){

        // https://github.com/mstrommer/StPro

        /*
        a name
        an amount of money
        a count (e.g. the number of visitors)
        an ID
        a color
        a calendar date
        a time of the day
        a day of the week (one of MON-SUN)
        an estimate of the number of protons in the universe
        the mass of the earth
        */
        // Declaration of variables
        // data type + name
        String firstname;
        // Initialize variables '='
        firstname = "Michael";
        System.out.println(firstname);
        System.out.printf("%10.2s",firstname);
        double amount_of_money = 120.50;
        float another_amount_of_money = 120.50f;
        int count = 10;
        long another_count = 11L;
        // constants
        final int ID = 12345;
        long color;
        String date = "20. Sept., 2023";
    }
}
