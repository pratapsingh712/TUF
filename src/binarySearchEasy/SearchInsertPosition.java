package binarySearchEasy;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertPosition {
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

        System.out.println("Enter the key you want to Insert in your array :");
        int key = sc.nextInt();

        getInsertPosition(array,key);
    }

    private static void getInsertPosition(int[] array, int key) {
        int position = 0; //

        for(int i=0;i< array.length-1;i++){
            if(array[i]<key && array[i+1]>key){
                position = i+2; // this i am doing so that we can handle to increasing size of array as well and return proper index value where we can insert
                System.out.println("Position at which you can insert is : "+position);
                return;
            }
            else if(array[i]==key){
                System.out.println("Position is : "+i);
                return;// simply return the index of already present element
            }
        }

        System.out.println("Position is : "+(array.length+1));
    }
}
