package recursionGFG;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements in your array :");

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the target you want to search :");
        int target = sc.nextInt();

        int index = exist(array,target);

        System.out.println("Key found : "+index);

    }

    private static int exist(int[] array, int target) {
        int low = 0;
        int high = array.length-1;

        return helper(array,target,low,high);
    }

    private static int helper(int[] array, int target, int low, int high) {
        if(low>high){
            return -1;
        }

        int mid = low + (high-low)/2;

        if(array[mid]==target){
            return mid;
        }
        else if(array[mid]>target){
            // target on the left hand side
            high = mid-1;
            return helper(array,target,low,high);
        }else {
            low = mid+1;
            return helper(array,target,low,high);
        }
    }
}
