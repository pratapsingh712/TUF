package arrayMedium;

import java.util.Scanner;

public class TwoSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the sum :");
        int sum = sc.nextInt();

        twoSum(array,sum);
    }

    private static void twoSum(int[] array, int sum) {

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==sum){
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No:");
    }
}
