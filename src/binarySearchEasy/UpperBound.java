package binarySearchEasy;

import java.util.Arrays;
import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
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

        getUpperBound(array,key);
    }

    private static void getUpperBound(int[] array, int key) {

        for(int i=0;i< array.length;i++){
            if(array[i]>key){
                System.out.println("Key found at : "+i);
                return;
            }
        }

        System.out.println("Key not found : ");
    }
}
