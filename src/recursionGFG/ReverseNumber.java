package recursionGFG;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();

        System.out.println("Original Number is : "+num);
        System.out.println("After reversing : "+reverse(num,0));

    }

    private static int reverse(int num, int rev) {
        if(num==0) return rev;

       return reverse(num/10, rev*10+num%10);

    }
}
