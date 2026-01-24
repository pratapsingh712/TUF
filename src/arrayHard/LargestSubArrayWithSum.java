package arrayHard;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSubArrayWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array :"+ Arrays.toString(array));

        System.out.println("Enter a Target you want to search in the array :");
        int target = sc.nextInt();

        getLargestSubArray(array,target);
    }

    private static void getLargestSubArray(int[] array, int target) {
        int length = 0, maxLength = 0;

        for(int i=0;i<array.length;i++){
            int sum = 0;
            for(int j=i;j<array.length;j++){
                sum += array[j];
                if(sum==target){
                    length = (j-i)+1;
                    if(length>maxLength){
                        maxLength = length;
                    }
                }
            }
        }

        System.out.println("Maximum Subarray length to reach target is : "+maxLength);
    }

}
