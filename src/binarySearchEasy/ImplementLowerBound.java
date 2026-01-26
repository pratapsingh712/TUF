package binarySearchEasy;

import java.util.Arrays;
import java.util.Scanner;

public class ImplementLowerBound {
    public static void main(String[] args) {
        // problem statement says array will always be sorted
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements in your array :"); // mind that array has to be sorted
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array : "+ Arrays.toString(array));

        System.out.println("Enter the key you want to search in your array :");
        int key = sc.nextInt();

        getLowerBound(array,key);
    }

    private static void getLowerBound(int[] array, int key) {
        // need to return the index of lower bound that is >= key

        for(int i=0;i< array.length;i++){
            if(array[i]>=key){
                System.out.println("Found Lower bound at : "+i);
                return;
            }
        }

        System.out.println("Lower bound not found :");
    }
}
