package sortingTechnique_II;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int [] array = new int[size];

        System.out.println("Enter the elements in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array is : "+ Arrays.toString(array));

//        System.out.println("After sorting the array :"+Arrays.toString(bubbleSort(array,array.length-1)));

        System.out.println("After sorting the Array :");

        bubbleSort(array,size-1,true);

        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array,int size,boolean swap){

        if(size==0) return;
        if(!swap) return; // this will check if any swaps happened in the first go this will save time for us in case we already have sorted array

        swap = false;

        for(int j=0;j<=size-1;j++){
            if(array[j]>=array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                swap = true;
            }
        }

        bubbleSort(array,size-1,swap);

    }

//    private static int[] bubbleSort(int[] array) {
//
//        for(int i=array.length-1;i>=0;i--){
//            for(int j=0;j<=i-1;j++){
//                if(array[j]>array[j+1]){
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
//        }
//
//        return array;
//    }
}
