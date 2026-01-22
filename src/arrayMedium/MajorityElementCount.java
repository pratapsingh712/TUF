package arrayMedium;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElementCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array :"+ Arrays.toString(array));

//        Arrays.sort(array);
//
//        System.out.println("Majority Element appeared n/2 times is : "+array[size/2]);

        moresVotingAlgorithm(array);
    }

    private static void moresVotingAlgorithm(int[] array) {
        int el = 0, ct = 0;

        for(int i=0;i<array.length;i++){
            if(ct==0){
                el = array[i];
                ct++;
            }else if(el==array[i]){
                ct++;
            }else{
                ct--;
            }
        }

        if(ct>0)
            System.out.println("Majority element : "+el);
        else System.out.println("There are no majority element :");
    }
}
