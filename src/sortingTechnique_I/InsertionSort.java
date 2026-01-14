package sortingTechnique_I;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements in your array :");

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Before sorting the array :"+ Arrays.toString(array));

        insertionSort(array);
    }

    private static void insertionSort(int[] array) {

        for(int i=1;i<array.length;i++){
            int key = array[i];
            int j = i-1;

            // shift element one position that are greater than key
            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
                j--;
            }

            // insert the key at the right position
            array[j+1] = key;
        }

        System.out.println("After sorting the array : "+Arrays.toString(array));
    }
}
