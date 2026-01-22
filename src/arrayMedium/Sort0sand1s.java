package arrayMedium;

import java.util.Arrays;
import java.util.Scanner;

public class Sort0sand1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the 0s,1s and 2s into your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array :"+ Arrays.toString(array));
        
        sortZerosOnceAndTwos(array);

        System.out.println("After Sorting : "+Arrays.toString(array));
    }

    private static void sortZerosOnceAndTwos(int[] array) {
        int count0 = 0, count1 = 0, count2 = 0;

        for(Integer num : array){
            if(num==0){
                count0++;
            }else if(num==1){
                count1++;
            }else{
                count2++;
            }
        }

        int index = 0;

        while (count0>0){
//            System.out.print("0 ");
            array[index++] = 0;
            count0--;
        }
        while (count1>0){
//            System.out.print("1 ");
            array[index++] = 1;
            count1--;
        }
        while (count2>0){
//            System.out.print("2 ");
            array[index++] = 2;
            count2--;
        }
        System.out.println();
    }
}
