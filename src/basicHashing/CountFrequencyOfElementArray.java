package basicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencyOfElementArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Please enter values in your array : ");

        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }

//        countFrequency(array,visited); this is for brute force approach

        countFrequency(array);

    }

    // Now the Optimal solution will be to use the Unordered Map

    public static void countFrequency(int[] array){
        Map<Integer,Integer> frequencyArray = new HashMap<>();

        for(Integer key : array){
            frequencyArray.put(key,frequencyArray.getOrDefault(key,0)+1);
        }

        frequencyArray.forEach((key,value)-> System.out.println(key+" : "+value));
    }

//    private static void countFrequency(int[] array, boolean[] visited) {
//        int n = array.length;
//
//        for(int i=0;i<n;i++){
//            int count = 1;
//
//            if(visited[i]){
//                continue;
//            }
//
//            for(int j=i+1;j<n;j++){
//                if(array[i]==array[j]){
//                    count++;
//                    visited[j] = true;
//                }
//            }
//
//            System.out.println("Count of "+array[i]+" is = "+count);
//        }
//
////        for(Boolean value : visited){
////            System.out.println(value);
////        }
//
//    }
}
