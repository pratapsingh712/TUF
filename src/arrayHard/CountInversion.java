package arrayHard;

import java.util.Arrays;
import java.util.Scanner;

public class CountInversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array Element are : "+ Arrays.toString(array));

        getCountInversion(array);
    }

    private static void getCountInversion(int[] array) {
        int count =0;

        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j< array.length;j++){
                if(array[i]>array[j]){
                    count++;
                }
            }
        }

        System.out.println("Total number of inversion possible is : "+count);
    }
}
