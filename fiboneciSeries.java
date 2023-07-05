import java.util.Scanner;

public class fiboneciSeries {

    void fibo(int n) {
        int first = 0;
        int second = 1;
        int third;
        System.out.print(first + " ");
        System.out.print(second + " ");

        for (int i = 0; i < n; i++) {
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }

    void cube(int n) {
        System.out.print("cube =" + n * n * n);
    }

    void square(int n) {
        System.out.print("square =" + n * n);
    }

    public static void main(String arg[]) {
        int n = 5, ch;
        Scanner sc = new Scanner(System.in);
        fiboneciSeries ob = new fiboneciSeries();
        do {
            System.out.println("\n 1 - fiboneciSeries \n 2 - cube of n \n 3 - square of n");
            System.out.println("\n enter choice ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    ob.fibo(n);
                    break;
                case 2:
                    ob.cube(n);
                    break;
                case 3:
                    ob.square(n);
                    break;

            }

        } while (ch < 4);
    }
}