package sortingTechnique_II;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {

        // I have understood the algorithm in general but how to code I still need to figure out

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        System.out.println("Enter the array elements :");
        int [] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        // now I have the array elements

        System.out.println("Original array : "+ Arrays.toString(array));

        divide(array);

        System.out.print("After sorting the array we get : ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    private static void divide(int[] inputArray){
        int size = inputArray.length;

        if(size<2){
            return;
        }
        int mid = size/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[size-mid];

        // copied all the element of left side from array into leftArray
        for(int i=0;i<mid;i++){
            leftArray[i] = inputArray[i];
        }
        // copied all the element of right side from array into right Array
        for(int i=mid;i<size;i++){
            rightArray[i-mid] = inputArray[i];
        }

        divide(leftArray);
        divide(rightArray);

        // Now I should copy both the array into one array

        merge(inputArray,leftArray,rightArray);
    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray){
        int i=0, j=0, k=0;

        while(i<leftArray.length && j<rightArray.length){
            if(leftArray[i]<rightArray[j]){
                inputArray[k++] = leftArray[i++];
            }else{
                inputArray[k++] = rightArray[j++];
            }
        }

        // now clean up from left
        while(i<leftArray.length){
            inputArray[k++] = leftArray[i++];
        }

        while(j<rightArray.length){
            inputArray[k++] = rightArray[j++];
        }
    }
}
