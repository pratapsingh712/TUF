package arrayEasy;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        // between 1 to N
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size-1];

        System.out.println("Enter elements in your array :");
        for(int i=0;i<size-1;i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("Original array :"+ Arrays.toString(array));

        missingElement(array,size);
    }

    private static void missingElement(int[] array,int size) {
        int n = size;
        int actualSum = n*(n+1)/2;

        int sum = 0;
        for(Integer num : array){
            sum += num;
        }

        System.out.println("Missing element from array is : "+(actualSum-sum));
    }
}
