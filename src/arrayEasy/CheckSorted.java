package arrayEasy;

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements in your array :");

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        if(checkSorted(array)){
            System.out.println("Array is Sorted:");
        }else{
            System.out.println("Array is not sorted :");
        }
    }

    private static boolean checkSorted(int[] array) {
        for(int i=1;i<array.length;i++){
            if(array[i-1]>array[i]){
                return false;
            }
        }

        return true;
    }
}
