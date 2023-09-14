package _02_FormattedOutput;

public class Main {

    /*
     multi line
     zweite Zeile
     dritte Zeile
    */

    // eine Zeile

    /**
     * Java Doc
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Hello World!"); // mit Line break
        System.out.print("Hello World!\n"); // "manueller" Line break
        System.out.print("Hello World!"); // ohne Line break
        System.out.printf("Hello World!\n"); // ohne Line break
        System.out.printf("\\\n"); // print '\'
        System.out.printf("\"\n"); // print '"'
        System.out.println(100.0);
        System.out.printf("%d\n", 100);
        System.out.printf("Kontostand: %+10d€\n", 100*100);
        System.out.printf("Kontostand: %10d€\n", 100000);
        System.out.printf("Kontostand: %10d€\n", 1000);
        System.out.printf("Kontostand: %f€\n", 999.3234);
        System.out.printf("Kontostand: %+-10.2f€\n", 999.3266);
        System.out.printf("Kontostand: %10s€\n", "100x100");
    }
}
