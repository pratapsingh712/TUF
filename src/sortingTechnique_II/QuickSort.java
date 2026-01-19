package sortingTechnique_II;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]  = sc.nextInt();
        }

        System.out.println("Original Array Elements are : "+ Arrays.toString(array));

        quickSort(array,0,size-1);
    }

    private static void quickSort(int[] array, int low, int high) {

        if(low<high){
            int pivotIndex = partition(array,low,high);

            quickSort(array, low, pivotIndex-1);

            quickSort(array, pivotIndex+1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {

        int pivot = array[high];

        int i = low-1;

        for(int j=low;j<high;j++){
            if(array[j]<=pivot){
                //swap
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        System.out.println(Arrays.toString(array));

        return i+1;
    }
}
