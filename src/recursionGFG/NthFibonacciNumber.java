package recursionGFG;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to return the Nth Fibonacci Number :");
        int num = sc.nextInt();

        System.out.println(num+" th Fibonacci term is : "+fibonacci(num));

    }

    private static int fibonacci(int num){
        if(num==0 || num==1) return num;

        return fibonacci(num-1)+fibonacci(num-2);
    }
}
