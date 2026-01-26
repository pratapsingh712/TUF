package binarySearchEasy;

import java.util.Arrays;
import java.util.Scanner;

public class LastOccurrence {
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

        System.out.println("Enter the last occurrence of key you want to search in your array :");
        int key = sc.nextInt();

        getLastOccurrence(array,key);
    }

    private static void getLastOccurrence(int[] array, int key) {

        for (int i=array.length-1;i>=0;i--){
            if(key>array[i]){
                System.out.println("Not found -1:");
                return;
            }
            if(array[i]==key){
                System.out.println("Found at : "+i);
                return;
            }
        }

        System.out.println("Key not found -1 :");
    }
}
