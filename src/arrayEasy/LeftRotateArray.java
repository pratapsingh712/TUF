package arrayEasy;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int [] array = new int[size];

        System.out.println("Enter the elements into your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array :"+ Arrays.toString(array));

        leftRotate(array);
    }

    private static void leftRotate(int[] array) {
        int n = array.length-1;
        int rotationElement = array[0];

        for(int i=1;i<array.length;i++){
            array[i-1] = array[i];
        }

        array[n] = rotationElement;

        System.out.println("After left rotating the array : "+Arrays.toString(array));
    }
}
