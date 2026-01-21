package arrayEasy;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByDPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("By how many times you want to rotate your array :");
        int d = sc.nextInt();

        array = leftRotateByD(array,d);

        System.out.println("After left rotating by "+d+" times we get "+ Arrays.toString(array));
    }

    private static int[] leftRotateByD(int[] array,int times) {
        if(times==0) return array;

        int key = array[0];
        int n = array.length-1;

        for(int i=1;i<array.length;i++){
            array[i-1] = array[i];
        }

        array[n] = key;

        return leftRotateByD(array, times-1);
    }
}
