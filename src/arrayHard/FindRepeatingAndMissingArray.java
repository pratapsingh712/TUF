package arrayHard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindRepeatingAndMissingArray {
    public static void main(String[] args) {
        // Given an integer array nums of size n containing values from [1, n] and each value appears exactly
        // once in the array, except for A, which appears twice and B which is missing.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array Element are : "+ Arrays.toString(array));

        getMissingAndRepeated(array);
    }

    private static void getMissingAndRepeated(int[] array) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=1;i<=array.length;i++){ // initialized map with 1-n elements
            map.put(i,0);
        }

        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.getOrDefault(array[i],0)+1);
            }
        }

        // The answer is map value with 2

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==0){
                // this is my missing value :
                System.out.println("Missing Value is : "+entry.getKey());
            }
            else if(entry.getValue()==2){
                System.out.println("Repeated Elements are : "+entry.getKey());
            }
        }
    }
}
