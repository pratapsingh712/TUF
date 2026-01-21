package arrayEasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppearOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array : "+ Arrays.toString(array));

        appearedOnce(array);
    }

    private static void appearedOnce(int[] array) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                map.put(array[i],map.getOrDefault(array[i],0)+1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("Value appeared only once in array is :"+entry.getKey());
                return;
            }
        }

        System.out.println("No value appeared only once :");
    }

//    private static void appearedOnce(int[] array) {
//        int count = 0;
//        boolean[] visited = new boolean[array.length];
//
//        for(int i=0;i<array.length;i++){
//            if(!visited[i]) {
//                count = 0;
//                for (int j = 0; j < array.length; j++) {
//                    if (array[i] == array[j]) {
//                        count++;
//                        visited[j] = true;
//                    }
//                }
//            }
//
//            if(count==1){
//                System.out.println(array[i]+" is appeared only once :");
//                return;
//            }
//        }
//
//        System.out.println("No element appeared only once :");
//    }
}
