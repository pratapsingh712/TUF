package arrayEasy;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInAnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int [] array = new int[size];

        System.out.println("Enter elements in your array :");
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array is : "+ Arrays.toString(array));

        maxElement(array);

    }

    private static void maxElement(int[] array) {
        int max = array[0];

        for(Integer num : array){
            if(num>max){
                max = num;
            }
        }

        System.out.println("Maximum element in your array is = "+max);
    }
}
