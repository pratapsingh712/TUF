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
        int minPrice = Integer.MAX_VALUE;
        int profit = 0; // assuming if all negative value i will not buy and sell and profit would remain 0
        int maxProfit = 0;
        int buyDay = -1, sellDay = -1;
        int index = -1;

        for(int i=0;i<array.length;i++){
            if(array[i]<minPrice){
                minPrice = array[i];
                buyDay = i;
            }

            profit = array[i] - minPrice;

            if(profit>maxProfit){
                maxProfit = profit;
                sellDay = i;
            }
        }

        System.out.println("Maximum profit when you buy on day "+buyDay+" and sell it on "+sellDay+" gives you total of "+maxProfit);

//        for(Integer price : array){
//            index++;
//
//            if(price<minPrice){
//                minPrice = price;
//                buyDay = index;
//            }
//            maxProfit = Math.max(maxProfit,(price-minPrice));
//        }



        System.out.println("Maximum profit : "+maxProfit);
    }
}
