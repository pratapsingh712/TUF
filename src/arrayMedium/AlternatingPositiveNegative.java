package arrayMedium;

import java.util.Arrays;
import java.util.Scanner;

public class AlternatingPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array :"+ Arrays.toString(array));

        alternateNumbers(array);
    }

    private static void alternateNumbers(int[] array) {
        int posSize = 0;
        int negSize = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                posSize++;
            }else {
                negSize++;
            }
        }

        int[] pos = new int[posSize];
        int[] neg = new int[negSize];
        int posIndex = 0;
        int negIndex = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                pos[posIndex++] = array[i];
            }else if(array[i]<0){
                neg[negIndex++] = array[i];
            }
        }

        posIndex = 0;
        negIndex = 0;

        for(int i=0;i<array.length;i+=2){
            array[i] = pos[posIndex++];
        }

        for(int i=1;i<array.length;i+=2){
            array[i] = neg[negIndex++];
        }

        System.out.println("After Sorting alternative numbers "+Arrays.toString(array));
    }
}
