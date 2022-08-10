package LP4;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        int remainder, reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number you want to reverse : ");
        int num = sc.nextInt();
        while(num>0) {
            remainder = num %10;
            reverse = reverse * 10 + remainder;
            num = num /10;
        }
        System.out.println("Reverse of entered number is "+reverse);
    }
}
