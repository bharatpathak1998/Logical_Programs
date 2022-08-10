package LP3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime or not : ");
        int num = sc.nextInt();

        for (int i=2; i<=num/2; i++) {
            if (num%i==0) {
                count++;
                break;
            }
        }
        if(count == 0 && num != 1 ) {
            System.out.println( num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
