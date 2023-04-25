import java.util.Scanner;

public class FibonacciSeries {
    int num1, num2, count;

    FibonacciSeries(int n1, int n2, int cnt) {
        num1 = n1;
        num2 = n2;
        count = cnt;
    }

    void generateSeries() {
        int num3;
        System.out.print(num1 + " " + num2);

        for (int i = 2; i < count; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the count of Fibonacci numbers to be generated: ");
        int count = sc.nextInt();

        FibonacciSeries fib = new FibonacciSeries(num1, num2, count);
        fib.generateSeries();
    }
}
