package _07_Functions;

public class BeTheCompiler {
    public static void main(String[] args) {

        //make memory sketches to track the values
        //of the variables
        //BE the debugger!

        int a = 1;
        int b, c, d, e, f, g;
        foo(a);
        System.out.printf("%d\n", a);   //<---- what is the output?

        a = bar(a);
        System.out.printf("%d\n", a);   //<---- what is the output?

        a = foobar(a);
        System.out.printf("%d\n", a);   //<---- what is the output?

        eggs(10);			//<---- what is the output?
        spam(2);			//<---- what is the output?
    }

    public static void eggs(int n) {
        if (n == 0)
            return;
        System.out.printf("%d ", n);
        eggs(n - 1);
        System.out.printf("%d ", n);
    }

    public static void spam(int i) {
        spam(i);
    }

    public static void foo(int a) {
        a++;
    }

    public static int bar(int z) {
        z++;
        return z;
    }

    public static int foobar(int a) {
        int n = a;
        foo(bar(n));
        return a;
    }
}
