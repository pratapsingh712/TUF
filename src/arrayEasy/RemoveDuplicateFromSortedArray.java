package arrayEasy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements in your array in sorted order:");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array :"+ Arrays.toString(array));

        System.out.println("After removing the duplicates :");

        int index = removeDuplicates(array);

        for(int i=0;i<=index;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }

    private static int removeDuplicates(int[] array){
        int index = 0;

        for(int j=1;j<array.length;j++){
            if(array[index]!=array[j]){
                index++;
                array[index] = array[j];
            }
        }
        return index;
    }

//    private static int removeDuplicates(int[] array){
//
//        int index = 0;
//
//        HashSet<Integer> seen = new HashSet<>();
//
//        for(Integer num : array){
//            if(!seen.contains(num)){
//                seen.add(num);
//
//                array[index] = num;
//
//                index++;
//            }
//        }
//
//        return index;
//    }
}
