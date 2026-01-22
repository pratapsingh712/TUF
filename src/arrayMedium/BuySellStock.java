package arrayMedium;

import java.util.Scanner;

public class BuySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the stock price :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        maxProfit(array);
    }

    private static void maxProfit(int[] array) {
        int min = Integer.MAX_VALUE;
        int profit = 0; // assuming if all negative value i will not buy and sell and profit would remain 0
        int maxProfit = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }else if(min<array[i]){
                profit = array[i]-min;
                if(profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }

        System.out.println("Maximum profit : "+maxProfit);
    }
}
