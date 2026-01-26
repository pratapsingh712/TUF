package binarySearchEasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements in your array :"); // mind that array has to be sorted
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array : "+ Arrays.toString(array));

        System.out.println("Enter the key you want to get it's count in your array :");
        int key = sc.nextInt();

        getCountOccurrences(array,key);
    }

    private static void getCountOccurrences(int[] array, int key) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(Integer num : array){
            if(map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0)+1);
            }else{
                map.put(num,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey()==key){
                System.out.println("Total count of occurrences "+entry.getValue());
                return;
            }
        }

        System.out.println("Not Found -1 :");
    }
}
