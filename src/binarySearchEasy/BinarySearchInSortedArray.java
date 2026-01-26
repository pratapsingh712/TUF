package binarySearchEasy;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInSortedArray {
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

        getKeyBinarySearch(array,key);
    }

    private static void getKeyBinarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length-1;


        while (start<=end){
            int mid = start + (end-start)/2;

            if(array[mid]==key){
                System.out.println("Found :");
                return;
            }
            else if(array[mid]<key)
            {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        System.out.println("Key not found :");

    }
}
