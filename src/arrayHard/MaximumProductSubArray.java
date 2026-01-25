package arrayHard;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array :"+ Arrays.toString(array));

        getMaximumProductSubArray(array);
    }

    private static void getMaximumProductSubArray(int[] array) {
        int maxProductSum = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            int productSum = 1;
            for(int j=i;j<array.length;j++){
                productSum *= array[j];
                if(productSum>maxProductSum){
                    maxProductSum = productSum;
                }
            }
        }

        System.out.println("Maximum product = "+maxProductSum);
    }
}
