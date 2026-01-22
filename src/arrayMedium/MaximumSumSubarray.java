package arrayMedium;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the element in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array Elements are :"+ Arrays.toString(array));

        maximumSumSubArray(array);

    }

    private static void maximumSumSubArray(int[] array) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
//        int startIndex = 0, endIndex = 0;

        for(int i=0;i<array.length;i++){
                sum += array[i];
                if(maxSum<sum){
                    maxSum = sum;
                }
                if(sum<0){
                    sum = 0;
                }
        }

        System.out.println("Maximum sum is : "+maxSum);

    }
}
