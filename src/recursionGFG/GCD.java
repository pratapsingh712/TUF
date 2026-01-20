package recursionGFG;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("HCF of :"+num1+" and "+num2+" is "+hcf(num1,num2));
    }

    private static int hcf(int num1, int num2) {
        if(num1==0) return num2;
        else if(num2==0) return num1;

        if(num1>num2){
            return hcf(num1%num2,num2);
        }else{
            return hcf(num1,num2%num1);
        }
    }
}
