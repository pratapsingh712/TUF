package arrayMedium;

import java.util.Arrays;
import java.util.Scanner;

public class CountSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the element in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the sum :");
        int sum = sc.nextInt();

        System.out.println("Original Array : "+ Arrays.toString(array));

        countSubArraySum(array,sum);
    }

    private static void countSubArraySum(int[] array, int sum) {
        int currentCount = 0, maxCount = -1;
        int currentSum = 0;

        for(int i=0;i<array.length;i++){
            currentSum = 0;
            for(int j=i;j<array.length;j++){
                currentSum += array[j];
                if(currentSum==sum){
                    currentCount++;
                }
            }
            if(currentCount>maxCount){
                maxCount = currentCount;
            }
        }

        System.out.println("Maximum SubArray to get sum = "+sum+" is = "+maxCount);
    }
}
