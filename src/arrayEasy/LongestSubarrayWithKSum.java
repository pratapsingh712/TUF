package arrayEasy;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubarrayWithKSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the sum you want : ");
        int sum = sc.nextInt();

        System.out.println("Original Array :"+ Arrays.toString(array));

        longestSubArrayWithSum(array,sum);
    }

    private static void longestSubArrayWithSum(int[] array, int keySum) {
        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;
        boolean found = false;
        int maxLength = 0;

        for(int i=0;i<array.length;i++){
            sum = 0;
            for(int j=i;j<array.length;j++){
                sum += array[j];
                if(sum==keySum){
                    startIndex = i;
                    endIndex = j;
                    found = true;
                }
            }
            if((endIndex-startIndex)+1>maxLength){
                maxLength = (endIndex-startIndex)+1;
            }
        }

        if(found)
            System.out.println("Longest sub-array with a sum equal to "+keySum+" is = "+maxLength);
        else
            System.out.println("Not found status code -1 ");
    }
}
