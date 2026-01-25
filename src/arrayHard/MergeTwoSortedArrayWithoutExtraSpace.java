package arrayHard;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrayWithoutExtraSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of your array :");
        for(int i=0;i<size;i++){ // will be m+n size and all n elements should be zero
            array[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array :");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the element in your second array :");
        for(int i=0;i<size1;i++){
            array1[i] = sc.nextInt();
        }

        mergeTwoSortedArray(array,array1);

    }

    private static void mergeTwoSortedArray(int[] array, int[] array1) {
        int i = (array.length-array1.length)-1; // last valid index for array 1
        int j = array1.length-1;
        int k = array.length-1;

        while (i >= 0 && j >= 0) {
            // Place larger element from end of nums1 or nums2
            if (array[i] > array1[j]) {
                array[k--] = array[i--];
            } else {
                array[k--] = array1[j--];
            }
        }

        // If nums2 has leftovers, copy them to nums1
        while (j >= 0) {
            array[k--] = array1[j--];
        }


        System.out.println(Arrays.toString(array));
    }
}
