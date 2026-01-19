package arrayEasy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestAndSecondSmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements in your array :");
        for (int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array Elements are : "+ Arrays.toString(array));

        secondLargest(array);
        secondSmallest(array);
    }

    private static void secondLargest(int array[]){
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                secondMax = max;
                max = array[i];
            }else if(array[i]>secondMax && array[i]!=max){
                secondMax = array[i];
            }
        }

        System.out.println("Second largest element in array is : "+secondMax);
    }

    private static void secondSmallest(int array[]){

        int small = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){
            if(array[i]<small){
                secondSmallest = small;
                small = array[i];
            }else if(array[i]<secondSmallest && array[i]!=small){
                secondSmallest = array[i];
            }
        }

        System.out.println("Second Smallest element in array is :"+secondSmallest);

    }
}
