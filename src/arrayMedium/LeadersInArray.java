package arrayMedium;

import java.util.Arrays;
import java.util.Scanner;

public class LeadersInArray {
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

        getLeaders(array);
    }

    private static void getLeaders(int[] array) {

        int rightMost = array[array.length-1];
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=1;i<array.length-1;i++){
            if(array[i]>max){
                secondMax = max;
                max = array[i];
            }else if(array[i]>secondMax && array[i]!=max){
                secondMax = array[i];
            }
        }

        System.out.println("Leader of array are : "+rightMost+" , "+max+" and "+secondMax);

    }
}
