package recursionGFG;

import java.util.Scanner;

public class NthStair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the top stair you want to reach :");
        int stair = sc.nextInt();
        System.out.println("To reach "+stair+" we have these many number of ways : "+countWays(stair));
    }

    private static int countWays(int stair) {
        if(stair==1 || stair==2) return stair;

        return countWays(stair-1)+countWays(stair-2);
    }
}