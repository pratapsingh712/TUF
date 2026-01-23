package arrayMedium;

import java.util.Scanner;

public class SpiralMatrix {
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

        System.out.println("Original Matrix elements are : ");

        for(int[] num : array){
            for (Integer ele : num){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        System.out.println("Spiral Matrix : ");

        printSpiral(array);
    }

    private static void printSpiral(int[][] array) {
        int row = array.length;
        int col = array[0].length;

        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;

        while (top <= bottom && left <= right) {

            // left → right
            for (int i = left; i <= right; i++) {
                System.out.print(array[top][i] + " ");
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(array[i][right] + " ");
            }
            right--;

            // right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(array[bottom][i] + " ");
                }
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(array[i][left] + " ");
                }
                left++;
            }
        }

    }
}
