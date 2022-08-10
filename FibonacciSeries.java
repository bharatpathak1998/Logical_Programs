package LP1;

import java.util.Scanner;

public class FibonacciSeries {

    public static void fibonacciSeries(int num) {
        int num1 = 0, num2 = 1, num3;
        System.out.print(num1 + "  " + num2);
        for (int i=2; i<num; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print("  " + num3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check fibonacci series : ");
        int num = sc.nextInt();
        fibonacciSeries(num);
    }
}
