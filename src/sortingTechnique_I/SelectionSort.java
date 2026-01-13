package sortingTechnique_I;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int n = sc.nextInt();
        int [] array = new int[n];

        System.out.println("Enter elements into your array :");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }

        selectionSort(array);

    }

    private static void selectionSort(int[] array) {

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        // now we should have a sorted array
        System.out.println("Sorted Array is : "+ Arrays.toString(array));
    }
}
