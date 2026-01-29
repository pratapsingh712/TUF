package binarySearchEasy;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRotatedArray {
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

        System.out.println("Enter a key to search in your array :");
        int key = sc.nextInt();

        searchInRotatedArray(array,key);
    }

    private static void searchInRotatedArray(int[] array, int key) {
        int low = 0;
        int high = array.length-1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(array[mid]==key){
                System.out.println("Key found at : "+mid);
                return;
            }

            if(array[low]<=array[mid]){ // means left is sorted

                if(array[low]<=key && array[mid]>key){
                    // above is the range withing left part
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if (array[mid] < key && key <= array[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }

        System.out.println("not found :");
    }
}
