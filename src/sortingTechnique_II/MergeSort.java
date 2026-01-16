package sortingTechnique_II;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {

        // I have understood the algorithm in general but how to code I still need to figure out

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        System.out.println("Enter the array elements :");
        int [] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        // now I have the array elements

        System.out.println("Original array : "+ Arrays.toString(array));

        divide(array,0,size-1);

        System.out.print("After sorting the array we get : ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    private static void divide(int[] array, int si, int ei) {

        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        divide(array,si,mid);
        divide(array,mid+1,ei);
        conquer(array,si,mid,ei);

    }

    private static void conquer(int[] array, int si, int mid, int ei) {
        int[] merged = new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2<=ei){
            if(array[idx1]<=array[idx2]){
                merged[x] = array[idx1];
                x++;idx1++;
            }else{
                merged[x] = array[idx2];
                x++;idx2++;
            }
        }

        while(idx1<=mid){
            merged[x++] = array[idx1++];
        }

        while(idx2<=ei){
            merged[x++] = array[idx2++];
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            array[j] = merged[i];
        }
    }
}
