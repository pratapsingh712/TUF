package arrayMedium;

import java.util.Scanner;

public class RotateMatrixBy90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row :");
        int row = sc.nextInt();
        System.out.println("Enter the size of col :");
        int col = sc.nextInt();

        int[][] array = new int[row][col];

        System.out.println("Enter the element in your array :");
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array is : ");

        for(int[] num : array){
            for(Integer ele : num){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        System.out.println("+++++++++++++++++++++++++++++");

        rotateMatrix(array);

    }

    private static void rotateMatrix(int[][] array) {

        int[][] result = new int[array.length][array[0].length]; // assuming it's not jagged array :

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                result[j][array.length-i-1] = array[i][j]; // I am using auxiliary space here
            }
        }

        for(int[] num : result){
            for(Integer ele : num){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
