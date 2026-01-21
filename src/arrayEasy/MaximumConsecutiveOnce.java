package arrayEasy;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumConsecutiveOnce {
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

        maxOnce(array);
    }

    private static void maxOnce(int[] array) {
        int count = 0, maxCount = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]==1){
                count++;
                if(count>maxCount){
                    maxCount = count;
                }
            }else {
                count = array[i];
            }
        }

        System.out.println("Maximum consecutive once : "+maxCount);
    }
}
