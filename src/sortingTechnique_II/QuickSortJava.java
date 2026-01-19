package sortingTechnique_II;

import java.util.Arrays;
import java.util.Random;

public class QuickSortJava {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Original Array : "+ Arrays.toString(numbers));

        quickSort(numbers, 0, numbers.length-1);

        System.out.println("After sorting the Array : "+Arrays.toString(numbers));
    }

    private static void quickSort(int[] array, int lowIndex, int highIndex) {

        if(lowIndex>=highIndex){
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer<rightPointer){

            while(array[leftPointer]<=pivot && leftPointer<rightPointer){
                leftPointer++;
            }

            while(array[rightPointer]>=pivot && leftPointer<rightPointer){
                rightPointer--;
            }

            swap(array, leftPointer,rightPointer);
        }

        swap(array, leftPointer,highIndex);

        quickSort(array,lowIndex,leftPointer-1);
        quickSort(array,leftPointer+1,highIndex);

    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
