package arrayEasy;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] array = new int[size];
//        int[] zerosAtEndCopy = new int[size];

        System.out.println("Enter the elements in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array :"+ Arrays.toString(array));

        optimalMoveZeros(array);

//        moveZeros(array,zerosAtEndCopy);
    }

    private static void optimalMoveZeros(int[] array) {
        int index = 0;

        for(int j=1;j<array.length;j++){
            if(array[index]==0 && array[j]!=0){
                int temp = array[j];
                array[j] = array[index];
                array[index] = temp;
                index++;
            } else if(array[index]!=0){
                index++;
            }
        }

        // the work is done

        System.out.println("After moving zeros to end :");

        for(Integer num : array){
            System.out.print(num+" ");
        }
        System.out.println();
    }


//    private static void moveZeros(int[] array, int[] zerosAtEndCopy) {
//
//        int index = 0;
//        for(int i=0;i<array.length;i++){
//            if(array[i]!=0){
//                zerosAtEndCopy[index++] = array[i];
//            }
//        }
//
//        System.out.println("After moving zeros to end :");
//        for(Integer num : zerosAtEndCopy){
//            System.out.print(num+" ");
//        }
//        System.out.println();
//    }
}
