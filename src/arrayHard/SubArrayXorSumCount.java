package arrayHard;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrayXorSumCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the array elements :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the K :");
        int k = sc.nextInt();

        System.out.println("Original Array elements are :"+ Arrays.toString(array));

        getSubArrayCount(array,k);
    }

    private static void getSubArrayCount(int[] array, int k) {
        int count = 0;

        for(int i=0;i<array.length;i++){
            int sum = 0;
            for(int j=i;j<array.length;j++){
                sum ^= array[j];
                if(sum==k){
                    count++;
                }
            }

        }

        System.out.println("total subset with target = "+k+" is = "+count);
    }
}
