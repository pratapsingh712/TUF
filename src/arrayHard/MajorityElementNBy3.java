package arrayHard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElementNBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array :"+ Arrays.toString(array));

        getMajorityNBy3(array,size/3);
    }

    private static void getMajorityNBy3(int[] array, int count) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(Integer num : array){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        System.out.println("Majority Elements are :");
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>=count){
                System.out.println(entry.getKey());
            }
        }
    }
}
