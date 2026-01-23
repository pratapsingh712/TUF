package arrayMedium;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZero {
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

        setMatrix(array);
    }

    private static void setMatrix(int[][] array) {

        int row = 0;
        int column = 0;

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j] == 0){
                    markRow(i,array);
                    markCol(j,array);
                }
            }
        }

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]<0){
                    array[i][j] = 0;
                }
            }
        }

        System.out.println("After marking :");
        for(int[] num : array){
            for(Integer ele : num){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }

    private static void markCol(int j,int[][] array) {
        for(int i=0;i<array.length;i++){
            if(array[i][j]!=0){
                array[i][j] = -1;
            }
        }
    }

    private static void markRow(int i,int[][] array) {
        for(int j=0;j<array.length;j++){
            if(array[i][j]!=0){
                array[i][j] = -1;
            }
        }
    }
}
