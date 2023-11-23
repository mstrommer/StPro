package _07_Functions;
import java.util.Scanner;

public class Main {
    /*------------ DO NOT TOUCH ----------------*/
    static Scanner sc;

    public static void welcome(){
        System.out.println("Welcome to ColorFunctions!");
    }

    /*
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Test[] tests = { new Test() {
            @Override
            protected void exec() {
                welcome();

            }

        }, new Test() {
            @Override
            protected void exec() {
                good_bye();

            }

        }, new Test() {
            @Override
            protected void exec() {
                System.out.printf("%d\n", read_channel());
            }

        }, new Test() {
            @Override
            protected void exec() {
                int a, b, c;
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                System.out.printf("%d\n", encode(a, b, c));

            }

        }, new Test() {
            @Override
            protected void exec() {
                System.out.printf("%d\n", read_rgb());
            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                // scanf("%d", &a);
                a = sc.nextInt();
                System.out.printf("%d\n", red(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", green(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", blue(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                print_rgb(a);

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", rgb_2_cmy(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", cyan(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", magenta(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", yellow(a));
            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                print_cmy(a);

            }

        }, new Test() {
            @Override
            protected void exec() {
                convert();

            }

        }

        };
        System.out.printf("Test#: ");
        int n = sc.nextInt();
        if (n < 1 || n > tests.length + 1) {
            System.out.println("unknown test.");
            return;
        }
        tests[n - 1].run();
        sc.close();
    }

    private abstract static class Test {
        protected abstract void exec();

        void run() {
            System.out.printf("executing %s\n", this.getClass().getSimpleName());
            exec();
        }
    }
    */
}