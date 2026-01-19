package recursionGFG;

import java.util.Scanner;

public class APowB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base :");
        int a = sc.nextInt();
        System.out.println("Enter the power :");
        int b = sc.nextInt();


        // we can also do the operation in log time using a^b = a^b/2*a^b/2;

        System.out.println(a+" power "+b+" is "+logPow(a,b));
    }

    private static int logPow(int a, int b){
        if(b==0) return 1;

        int fun = logPow(a,b/2);
        if(b%2==0) return fun*fun;
        else return a*fun*fun;
    }

    private static int pow(int a, int b){
        if(b==0)return 1;

        return a*pow(a,b-1);
    }
}
