package basicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumAndMinimumFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }

        // now we have the array we can call our method to return highest and lowest frequency elements

        lowestAndHighestFrequencyElement(array);

    }

    public static void lowestAndHighestFrequencyElement(int[] array){

        Map<Integer,Integer> map = new HashMap<>();

        for(Integer key : array){
            map.put(key,map.getOrDefault(key,0)+1);
        }

        int lowestFreq = Integer.MAX_VALUE;
        int highestFreq = Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>highestFreq){
                highestFreq = entry.getKey();
            }
            if(entry.getValue()<lowestFreq){
                lowestFreq = entry.getKey();
            }
        }

        System.out.println("The element with lowest frequency is = "+lowestFreq);
        System.out.println("The element with highest frequency is = "+highestFreq);
    }
}
