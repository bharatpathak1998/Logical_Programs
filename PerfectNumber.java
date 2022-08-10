package LP2;

import java.util.Scanner;

public class PerfectNumber {

    static void perfectNum(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0)
                sum += i;
        }
        if(sum == n) {
            System.out.println(n+" is a perfect number");
        } else {
            System.out.println(n+" is not a perfect number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check perfect or not: ");
        int n = sc.nextInt();
        perfectNum(n);
    }
}
