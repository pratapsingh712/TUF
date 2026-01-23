package arrayMedium;

import java.util.Arrays;
import java.util.Scanner;

public class CountConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the element in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array : "+ Arrays.toString(array));

        countConsecutive(array);
    }

    private static void countConsecutive(int[] array) {
        int currentCount = 1, maxCount = 0;
        Arrays.sort(array);


        for(int i=0;i<array.length-1;i++){
            if(array[i+1]-array[i]==1){
                currentCount++;
                if(currentCount>maxCount){
                    maxCount = currentCount;
                }
            }else{
                currentCount = 1;
            }
        }

        System.out.println("Maximum consecutive elements in your array is : "+maxCount);
    }
}
