package arrayEasy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FindUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your first array :");
        int size = sc.nextInt();
        int [] array = new int[size];

        System.out.println("Enter elements in your array :");
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the size of your second array :");
        int size2 = sc.nextInt();
        int [] array2 = new int[size2];

        System.out.println("Enter elements in your array :");
        for(int i=0;i<size2;i++)
        {
            array2[i] = sc.nextInt();
        }

        System.out.println("Original Array1: "+ Arrays.toString(array));
        System.out.println("Original Array2: "+Arrays.toString(array2));

        findUnion(array,array2);
    }

    private static void findUnion(int[] array, int[] array2) {

        HashSet<Integer> union = new HashSet<>(); // similarly it can be done using hashmap and return the keys

        for(Integer num : array){
            if(!union.contains(num)) union.add(num);
        }

        for(Integer num : array2){
            if(!union.contains(num)){
                union.add(num);
            }
        }

        System.out.println("union of Array1 and Array 2 is : ");
        for(Integer num : union){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
