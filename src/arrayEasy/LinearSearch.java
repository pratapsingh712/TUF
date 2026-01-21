package arrayEasy;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array :"+ Arrays.toString(array));

        System.out.println("Enter the element that you want to search :");
        int key = sc.nextInt();

        searchKey(key,array);
    }

    private static void searchKey(int key, int[] array) {
        for(int i=0;i<array.length;i++){
            if(key==array[i]){
                System.out.println("key found at position :"+i);
                return;
            }
        }

        System.out.println("Key not found :");
    }
}
