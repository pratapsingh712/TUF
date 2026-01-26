package binarySearchEasy;

import java.util.Arrays;
import java.util.Scanner;

public class FloorCeilInSortedArray {
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

        System.out.println("Enter the key you want to search in your array :");
        int key = sc.nextInt();

        getFloorAndCeil(array,key);
    }

    private static void getFloorAndCeil(int[] array, int key) {
        // we just want to return the floor anc ceil value not their index
        int floorValue = 0;
        int ceilValue = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]<=key){
                floorValue = array[i];
            }if(array[i]>=key){
                ceilValue = array[i];
                break; // breaks after getting the first ceil value otherwise we can have largest element in array as ceil which we do not want
            }
        }

//        while(floor<ceil){ okay for floor but not for ceil
//            if(array[floor]<=key){
//                floorValue = array[floor];
//                floor++;
//            }else if(array[ceil]>=key){
//                ceilValue = array[ceil];
//                ceil--;
//            }
//        }

        System.out.println("floor and ceil value are ["+floorValue+","+ceilValue+"]");

    }
}
